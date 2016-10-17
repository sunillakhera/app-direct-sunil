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
import com.appdirect.integration.AppDirectService;
import com.appdirect.service.SubscriptionService;

/**
 * @author sunil.kumar.lakhera
 *
 */
@RestController
public class SubscriptionController {

 @AutowiredC
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
  if (Subscription == null) {
   return new ResponseEntity<SubscriptionCURD>(HttpStatus.NOT_FOUND);
  }
  return new ResponseEntity<SubscriptionCURD>(Subscription, HttpStatus.OK);
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
public ResponseEntity<Subscription> deleteSubscription(@PathVariable("id") Long subscriptionId) {
 HttpHeaders headers = new HttpHeaders();
 Subscription subscription = subscriptionService.getSubscription(subscriptionId);
 if (subscription == null) {   
  return new ResponseEntity<Subscription>(HttpStatus.NOT_FOUND);
 }
 subscriptionService.deleteSubscription(subscriptionId);
 headers.add("Subscription Deleted - ", String.valueOf(subscriptionId));
 return new ResponseEntity<Subscription>(subscription, headers, HttpStatus.NO_CONTENT);
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

/**Create   subscription AppDirect integraton
* @param Subscription
* @return 201 
*/
@RequestMapping(value = "/appdirect/subscription/", method = RequestMethod.POST,produces = "application/json")
public ResponseEntity<SubscriptionCURD> createSubscription(@RequestBody Subscription subscription) {
 HttpHeaders headers = new HttpHeaders();
 if (subscription == null) {
  return new ResponseEntity<Subscription>(HttpStatus.BAD_REQUEST);
 }
 
 https://www.appdirect.com/api/billing/v1/companies/a012bb88-c2c5-40a1-b140-ec6ed4593b78/users/3d4d2342-b7c4-4865-85bd-842f269adae6/subscriptions
	 
 appDirectService.callAppDirect("CRATE_URL", "RequestDomain", "ResponseDTO");
 
 
 headers.add("Subscription Created  - ", String.valueOf(subscription.getSubscriptionId()));
 return 
}

 
 /**
  * Update new  subscription by id
 * @param subscriptionId
 * @param Subscription
 * @return 200 ok
 */
@RequestMapping(value = "/subscription/{id}", method = RequestMethod.PUT)
 public ResponseEntity<SubscriptionCURD> updateSubscription(@PathVariable("id") Long subscriptionId, @RequestBody Subscription subscription) {
  HttpHeaders headers = new HttpHeaders();
  Subscription isExist = subscriptionService.getSubscription(subscriptionId);
  if (isExist == null) {   
   return new ResponseEntity<Subscription>(HttpStatus.NOT_FOUND);
  } else if (subscription == null) {
   return new ResponseEntity<Subscription>(HttpStatus.BAD_REQUEST);
  }
  subscriptionService.updateSubscription(subscription);
  headers.add("Subscription Updated  - ", String.valueOf(subscriptionId));
  return new ResponseEntity<Subscription>(subscription, headers, HttpStatus.OK);
 }

}