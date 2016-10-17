package com.appdirect.util;

import com.appdirect.bean.SubscriptionCURD;
import com.appdirect.domain.Order;
import com.appdirect.domain.OrderLine;
import com.appdirect.domain.OrderLines;
import com.appdirect.domain.Subscription;

public class AppDirectRequestBuilder {
	
	public static Subscription buildCreateSubscribtion(SubscriptionCURD subscriptionCurd){
	
	 Subscription  requestSub = new Subscription();
	 Order order = new Order();
	 order.setPaymentPlanId(String.valueOf(subscriptionCurd.getPaymentPlan()));
	 OrderLine orderLine = new OrderLine();
	 orderLine.setUnit(subscriptionCurd.getUnit());
	 orderLine.setQuantity(subscriptionCurd.getQuantity());
	 
	 OrderLines orderLines = new OrderLines();
	 OrderLine[] orderArray = new OrderLine[]{orderLine};
	 orderLines.setOrderLine(orderArray);
	 order.setOrderLines(orderLines);
	 requestSub.setOrder(order);
	 return  requestSub;

}
}
