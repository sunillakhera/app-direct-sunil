package com.appdirect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.appdirect.bean.SubscriptionCURD;
import com.appdirect.domain.Order;
import com.appdirect.domain.OrderLine;
import com.appdirect.domain.OrderLines;
import com.appdirect.domain.Subscription;
import com.appdirect.integration.AppDirectService;
import com.appdirect.integration.AppDirectServiceException;
import com.appdirect.service.SubscriptionService;
import com.appdirect.util.AppDirectConstants;
import com.appdirect.util.AppDirectRequestBuilder;

/**
 * @author sunil.kumar.lakhera
 *
 */
@RestController
public class SubscriptionController {

 @Autowired
 private SubscriptionService subscriptionService;
 
 @Autowired 
 private AppDirectService appDirectService;

 @RequestMapping(value = "/subscription", method = RequestMethod.GET, produces = "application/json")
 public ResponseEntity<List<SubscriptionCURD>> subscriptions() {

  HttpHeaders headers = new HttpHeaders();
  List<SubscriptionCURD> subscriptions = subscriptionService.getSubscriptions();

  if (subscriptions == null) {
   return new ResponseEntity<List<SubscriptionCURD>>(HttpStatus.NOT_FOUND);
  }
  headers.add("Number Of Records Found", String.valueOf(subscriptions.size()));
  return new ResponseEntity<List<SubscriptionCURD>>(subscriptions, headers, HttpStatus.OK);
 }

 
 
 /** Get  subscription by id
 * @param subscriptionId
 * @return Subscription
 */
@RequestMapping(value = "/subscription/{id}", method = RequestMethod.GET)
 public ResponseEntity<SubscriptionCURD> getSubscription(@PathVariable("id") Long subscriptionId) {
	SubscriptionCURD subscription = subscriptionService.getSubscription(subscriptionId);
  if (subscription == null) {
   return new ResponseEntity<SubscriptionCURD>(HttpStatus.NOT_FOUND);
  }
  return new ResponseEntity<SubscriptionCURD>(subscription, HttpStatus.OK);
 }
 


 /**Delete All subscription 
 * @param subscriptionId
 * @return 204 HTTP Response
 */
@RequestMapping(value = "/subscription/delete/{id}", method = RequestMethod.DELETE)
 public ResponseEntity<SubscriptionCURD> deleteSubscription(@PathVariable("id") Long subscriptionId) {
  HttpHeaders headers = new HttpHeaders();
  SubscriptionCURD subscription = subscriptionService.getSubscription(subscriptionId);
  if (subscription == null) {   
   return new ResponseEntity<SubscriptionCURD>(HttpStatus.NOT_FOUND);
  }
  subscriptionService.deleteSubscription(subscriptionId);
  headers.add("Subscription Deleted - ", String.valueOf(subscriptionId));
  return new ResponseEntity<SubscriptionCURD>(subscription, headers, HttpStatus.NO_CONTENT);
 }

 

/**Delete subscription integrated with Appdirect cancel subscription
* @param subscriptionId
* @return 204 HTTP Response
*/
@RequestMapping(value = "/subscription/appdirect/delete/{id}", method = RequestMethod.DELETE)
public ResponseEntity<Subscription> deleteAppDirectSubcription(@PathVariable("id") Long subscriptionId) {
 HttpHeaders headers = new HttpHeaders();
 appDirectService.callAppDirect(AppDirectConstants.END_POINT_URL+"/subscriptions/"+subscriptionId , null,null);
		
 subscriptionService.deleteSubscription(subscriptionId);
 headers.add("Subscription Deleted - ", String.valueOf(subscriptionId));
 return new ResponseEntity<Subscription>(headers, HttpStatus.NO_CONTENT);
}

 
 /**Create new  subscription 
 * @param Subscription
 * @return 201 
 */
@RequestMapping(value = "/subscription", method = RequestMethod.POST,produces = "application/json")
 public ResponseEntity<SubscriptionCURD> createSubscription(@RequestBody SubscriptionCURD subscription) {
  HttpHeaders headers = new HttpHeaders();
  if (subscription == null) {
   return new ResponseEntity<SubscriptionCURD>(HttpStatus.BAD_REQUEST);
  }
  subscriptionService.createSubscription(subscription);
  headers.add("Subscription Created  - ", String.valueOf(subscription.getSubscriptionId()));
  return new ResponseEntity<SubscriptionCURD>(subscription, headers, HttpStatus.CREATED);
 }

/**Create   subscription AppDirect integration
* @param Subscription
* @return 201 
*/
@RequestMapping(value = "/subscription/appdirect/companies/{companyID}/users/{userId}", method = RequestMethod.POST,produces = "application/json")
public Subscription createSubscriptionAppdirect(@RequestBody SubscriptionCURD subscriptionCurd ,@PathVariable("companyID") Long companyId ,@PathVariable("userId") Long userId) {
 HttpHeaders headers = new HttpHeaders();
 if (subscriptionCurd == null) {
   throw new AppDirectServiceException("Request is not valid", new Throwable());
 }
 
 Subscription request = AppDirectRequestBuilder.buildCreateSubscribtion(subscriptionCurd);
 Subscription subscription = ((Subscription)appDirectService.callAppDirect(AppDirectConstants.END_POINT_URL+"/companies/"+companyId+"/users/"+userId+"/subscriptions",request , Subscription.class));
 headers.add("Subscription Created  - ", String.valueOf(subscription.getId()));
 return subscription;
}

 
 /**
  * Update new  subscription by id
 * @param subscriptionId
 * @param Subscription
 * @return 200 ok
 */
@RequestMapping(value = "/subscription/{id}", method = RequestMethod.PUT)
 public ResponseEntity<SubscriptionCURD> updateSubscription(@PathVariable("id") Long subscriptionId, @RequestBody SubscriptionCURD subscription) {
  HttpHeaders headers = new HttpHeaders();
  SubscriptionCURD isExist = subscriptionService.getSubscription(subscriptionId);
  if (isExist == null) {   
   return new ResponseEntity<SubscriptionCURD>(HttpStatus.NOT_FOUND);
  } else if (subscription == null) {
   return new ResponseEntity<SubscriptionCURD>(HttpStatus.BAD_REQUEST);
  }
  subscriptionService.updateSubscription(subscription);
  headers.add("Subscription Updated  - ", String.valueOf(subscriptionId));
  return new ResponseEntity<SubscriptionCURD>(subscription, headers, HttpStatus.OK);
 }

}
