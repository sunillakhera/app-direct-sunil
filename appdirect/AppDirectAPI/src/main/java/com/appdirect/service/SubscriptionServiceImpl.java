package com.appdirect.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appdirect.bean.SubscriptionCURD;
import com.appdirect.dao.SubscriptionDao;

/**
 * @author sunil.kumar.lakhera
 *
 */
@Service("subscriptionService")
public class SubscriptionServiceImpl implements SubscriptionService {
 @Autowired
 private SubscriptionDao subscriptionDao;

 public List<SubscriptionCURD> getSubscriptions() {
  List<SubscriptionCURD> subscriptions = subscriptionDao.getSubscriptions();
  return subscriptions;
 }

 public SubscriptionCURD getSubscription(Long subscriptionId) {
	 SubscriptionCURD subscriptions = subscriptionDao.getSubscription(subscriptionId);
  return subscriptions;
 }

 public int deleteSubscription(Long subscriptionId) {
  return subscriptionDao.deleteSubscription(subscriptionId);
 }

 public int updateSubscription(SubscriptionCURD subscription) {
  return subscriptionDao.updateSubscription(subscription);
 }

 public int createSubscription(SubscriptionCURD subscription) {
  return subscriptionDao.createSubscription(subscription);
 }


}