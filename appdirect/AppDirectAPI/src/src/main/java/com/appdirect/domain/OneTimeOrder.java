package com.appdirect.domain;

public class OneTimeOrder
{
    private String id;

    private String startDate;

    private String status;

    private PaymentPlan paymentPlan;

    private String nextBillingDate;

    private String endDate;

    private String frequency;

    private String type;

    private String currency;

    private String totalPrice;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getStartDate ()
    {
        return startDate;
    }

    public void setStartDate (String startDate)
    {
        this.startDate = startDate;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public PaymentPlan getPaymentPlan ()
    {
        return paymentPlan;
    }

    public void setPaymentPlan (PaymentPlan paymentPlan)
    {
        this.paymentPlan = paymentPlan;
    }

    public String getNextBillingDate ()
    {
        return nextBillingDate;
    }

    public void setNextBillingDate (String nextBillingDate)
    {
        this.nextBillingDate = nextBillingDate;
    }

    public String getEndDate ()
    {
        return endDate;
    }

    public void setEndDate (String endDate)
    {
        this.endDate = endDate;
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
        return "ClassPojo [id = "+id+", startDate = "+startDate+", status = "+status+", paymentPlan = "+paymentPlan+", nextBillingDate = "+nextBillingDate+", endDate = "+endDate+", frequency = "+frequency+", type = "+type+", currency = "+currency+", totalPrice = "+totalPrice+"]";
    }
}
