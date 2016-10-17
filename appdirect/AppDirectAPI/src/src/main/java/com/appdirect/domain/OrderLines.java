package com.appdirect.domain;


public class OrderLines
{
private OrderLine[] orderLine;

public OrderLine[] getOrderLine ()
{
return orderLine;
}

public void setOrderLine (OrderLine[] orderLine)
{
this.orderLine = orderLine;
}

@Override
public String toString()
{
return "ClassPojo [orderLine = "+orderLine+"]";
}
}