package com.appdirect.bean;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author sunil.kumar.lakhera
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Subscription {

 private Long subscriptionId;
 private String unit;
 private String quantity;
 private Long paymentPlan;

 @JsonCreator
 public Subscription(@JsonProperty("subscriptionId") Long subscriptionId, @JsonProperty("unit") String unit,
   @JsonProperty("quantity") String quantity, @JsonProperty("paymentPlan") Long paymentPlan) {
  this.subscriptionId = subscriptionId;
  this.quantity = quantity;
  this.unit = unit;
  this.paymentPlan = paymentPlan;
 }

 public Subscription() {

 }

public Long getSubscriptionId() {
	return subscriptionId;
}

public void setSubscriptionId(Long subscriptionId) {
	this.subscriptionId = subscriptionId;
}

public String getUnit() {
	return unit;
}

public void setUnit(String unit) {
	this.unit = unit;
}

public String getQuantity() {
	return quantity;
}

public void setQuantity(String quantity) {
	this.quantity = quantity;
}

public Long getPaymentPlan() {
	return paymentPlan;
}

public void setPaymentPlan(Long paymentPlan) {
	this.paymentPlan = paymentPlan;
}

@Override
public String toString() {
	return "Subscription [subscriptionId=" + subscriptionId + ", unit=" + unit
			+ ", quantity=" + quantity + ", paymentPlan=" + paymentPlan + "]";
}

 
}