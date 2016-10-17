package com.appdirect.service;

import java.util.List;

import com.appdirect.bean.SubscriptionCURD;

/**
 * @author sunil.kumar.lakhera
 *
 */
public interface SubscriptionService {
 public List<SubscriptionCURD> getSubscriptions();
 public SubscriptionCURD getSubscription(Long subscriptionId);
 public int deleteSubscription(Long subscriptionId); 
 public int updateSubscription(SubscriptionCURD subscription);
 public int createSubscription(SubscriptionCURD subscription); 
}