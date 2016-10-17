package com.appdirect.domain;

public class PaymentPlan
{
    private String id;

    private String allowCustomUsage;

    private String isPrimaryPrice;

    private Contract contract;

    private String uuid;

    private String frequency;

    private String separatePrepaid;

    private String href;

    private Costs costs;

    private String keepBillDateOnUsageChange;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getAllowCustomUsage ()
    {
        return allowCustomUsage;
    }

    public void setAllowCustomUsage (String allowCustomUsage)
    {
        this.allowCustomUsage = allowCustomUsage;
    }

    public String getIsPrimaryPrice ()
    {
        return isPrimaryPrice;
    }

    public void setIsPrimaryPrice (String isPrimaryPrice)
    {
        this.isPrimaryPrice = isPrimaryPrice;
    }

    public Contract getContract ()
    {
        return contract;
    }

    public void setContract (Contract contract)
    {
        this.contract = contract;
    }

    public String getUuid ()
    {
        return uuid;
    }

    public void setUuid (String uuid)
    {
        this.uuid = uuid;
    }

    public String getFrequency ()
    {
        return frequency;
    }

    public void setFrequency (String frequency)
    {
        this.frequency = frequency;
    }

    public String getSeparatePrepaid ()
    {
        return separatePrepaid;
    }

    public void setSeparatePrepaid (String separatePrepaid)
    {
        this.separatePrepaid = separatePrepaid;
    }

    public String getHref ()
    {
        return href;
    }

    public void setHref (String href)
    {
        this.href = href;
    }

    public Costs getCosts ()
    {
        return costs;
    }

    public void setCosts (Costs costs)
    {
        this.costs = costs;
    }

    public String getKeepBillDateOnUsageChange ()
    {
        return keepBillDateOnUsageChange;
    }

    public void setKeepBillDateOnUsageChange (String keepBillDateOnUsageChange)
    {
        this.keepBillDateOnUsageChange = keepBillDateOnUsageChange;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", allowCustomUsage = "+allowCustomUsage+", isPrimaryPrice = "+isPrimaryPrice+", contract = "+contract+", uuid = "+uuid+", frequency = "+frequency+", separatePrepaid = "+separatePrepaid+", href = "+href+", costs = "+costs+", keepBillDateOnUsageChange = "+keepBillDateOnUsageChange+"]";
    }
}
