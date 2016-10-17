package com.appdirect.domain;

public class Order
{
    private String startDate;

    private String paymentPlanId;

    private String status;

    private String frequency;

    private String type;

    private String currency;

    private String id;

    private OneTimeOrders oneTimeOrders;

    private PaymentPlan paymentPlan;

    private String activated;

    private String nextBillingDate;

    private Company company;

    private OrderLines orderLines;

    private String parameters;

    private User user;

    private String totalPrice;

    public String getStartDate ()
    {
        return startDate;
    }

    public void setStartDate (String startDate)
    {
        this.startDate = startDate;
    }

    public String getPaymentPlanId ()
    {
        return paymentPlanId;
    }

    public void setPaymentPlanId (String paymentPlanId)
    {
        this.paymentPlanId = paymentPlanId;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public String getFrequency ()
    {
        return frequency;
    }

    public void setFrequency (String frequency)
    {
        this.frequency = frequency;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getCurrency ()
    {
        return currency;
    }

    public void setCurrency (String currency)
    {
        this.currency = currency;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public OneTimeOrders getOneTimeOrders ()
    {
        return oneTimeOrders;
    }

    public void setOneTimeOrders (OneTimeOrders oneTimeOrders)
    {
        this.oneTimeOrders = oneTimeOrders;
    }

    public PaymentPlan getPaymentPlan ()
    {
        return paymentPlan;
    }

    public void setPaymentPlan (PaymentPlan paymentPlan)
    {
        this.paymentPlan = paymentPlan;
    }

    public String getActivated ()
    {
        return activated;
    }

    public void setActivated (String activated)
    {
        this.activated = activated;
    }

    public String getNextBillingDate ()
    {
        return nextBillingDate;
    }

    public void setNextBillingDate (String nextBillingDate)
    {
        this.nextBillingDate = nextBillingDate;
    }

    public Company getCompany ()
    {
        return company;
    }

    public void setCompany (Company company)
    {
        this.company = company;
    }

    public OrderLines getOrderLines ()
    {
        return orderLines;
    }

    public void setOrderLines (OrderLines orderLines)
    {
        this.orderLines = orderLines;
    }

    public String getParameters ()
    {
        return parameters;
    }

    public void setParameters (String parameters)
    {
        this.parameters = parameters;
    }

    public User getUser ()
    {
        return user;
    }

    public void setUser (User user)
    {
        this.user = user;
    }

    public String getTotalPrice ()
    {
        return totalPrice;
    }

    public void setTotalPrice (String totalPrice)
    {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [startDate = "+startDate+", paymentPlanId = "+paymentPlanId+", status = "+status+", frequency = "+frequency+", type = "+type+", currency = "+currency+", id = "+id+", oneTimeOrders = "+oneTimeOrders+", paymentPlan = "+paymentPlan+", activated = "+activated+", nextBillingDate = "+nextBillingDate+", company = "+company+", orderLines = "+orderLines+", parameters = "+parameters+", user = "+user+", totalPrice = "+totalPrice+"]";
    }
}
			