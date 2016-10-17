package com.appdirect.dao;


import java.util.List;

import com.appdirect.bean.SubscriptionCURD;

/**
 * @author sunil.kumar.lakhera
 *
 */
public interface SubscriptionDao {
 public List<SubscriptionCURD> getSubscriptions();
 public SubscriptionCURD getSubscription(Long subsribtionId);
 public int deleteSubscription(Long subsribtionId); 
 public int updateSubscription(SubscriptionCURD subscription);
 public int createSubscription(SubscriptionCURD subscription);
}