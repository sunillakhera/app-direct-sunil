package com.appdirect.domain;

public class OneTimeOrders
{
    private OneTimeOrder oneTimeOrder;

    public OneTimeOrder getOneTimeOrder ()
    {
        return oneTimeOrder;
    }

    public void setOneTimeOrder (OneTimeOrder oneTimeOrder)
    {
        this.oneTimeOrder = oneTimeOrder;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [oneTimeOrder = "+oneTimeOrder+"]";
    }
}
