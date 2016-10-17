package com.appdirect.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.appdirect.bean.SubscriptionCURD;

@Repository("subscriptionDao")
public class SubscriptionDaoImpl implements SubscriptionDao {

 private JdbcTemplate jdbcTemplate;

 @Autowired
 public void setDataSource(DataSource dataSource) {
  this.jdbcTemplate = new JdbcTemplate(dataSource);
 }

 public List<SubscriptionCURD> getSubscriptions() {
  List<SubscriptionCURD> subscriptions = null ;
  
  try {
	  subscriptions = jdbcTemplate.query("SELECT * FROM trn_subscription",new BeanPropertyRowMapper<SubscriptionCURD>(SubscriptionCURD.class));   
  } catch (DataAccessException e) {
   e.printStackTrace();
  }
  return subscriptions;
 }

 public SubscriptionCURD getSubscription(Long subscriptionId) {
	 SubscriptionCURD subscription = null;
  try {
	  subscription = jdbcTemplate.queryForObject("SELECT * FROM trn_subscription WHERE subscription_id = ?",
     new Object[] { subscriptionId }, new BeanPropertyRowMapper<SubscriptionCURD>(SubscriptionCURD.class));
  } catch (DataAccessException e) {
   e.printStackTrace();
  }
  return subscription;

 }

 public int deleteSubscription(Long subscriptionId) {
  int count = jdbcTemplate.update("DELETE from trn_subscription WHERE subscription_id = ?", new Object[] { subscriptionId });
  return count;
 }

 public int updateSubscription(SubscriptionCURD subscription) {
  int count = jdbcTemplate.update(
    "UPDATE trn_subscription set unit_name = ? , quantity = ? , payment_plan = ? where subscription_id = ?", new Object[] {
    		subscription.getUnit(), subscription.getQuantity(), subscription.getPaymentPlan(), subscription.getSubscriptionId() });
  return count;
  

 }

 public int createSubscription(SubscriptionCURD subscription) {
  int count = jdbcTemplate.update(
    "INSERT INTO trn_subscription(subscription_id,unit_name, quantity, payment_plan)VALUES(?,?,?,?)", new Object[] {
    		subscription.getSubscriptionId() , subscription.getUnit(), subscription.getQuantity(), subscription.getPaymentPlan()});
  return count;
 }

}