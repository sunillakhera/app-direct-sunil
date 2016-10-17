package com.appdirect.domain;

public class Cost
{
    private Amount amount;

    private String unit;

    private String increment;

    private String minUnits;

    private String pricePerIncrement;

    private String meteredUsage;

    private String blockOriginalContractDecrease;

    private String blockContractDecrease;

    private String blockContractIncrease;

    public Amount getAmount ()
    {
        return amount;
    }

    public void setAmount (Amount amount)
    {
        this.amount = amount;
    }

    public String getUnit ()
    {
        return unit;
    }

    public void setUnit (String unit)
    {
        this.unit = unit;
    }

    public String getIncrement ()
    {
        return increment;
    }

    public void setIncrement (String increment)
    {
        this.increment = increment;
    }

    public String getMinUnits ()
    {
        return minUnits;
    }

    public void setMinUnits (String minUnits)
    {
        this.minUnits = minUnits;
    }

    public String getPricePerIncrement ()
    {
        return pricePerIncrement;
    }

    public void setPricePerIncrement (String pricePerIncrement)
    {
        this.pricePerIncrement = pricePerIncrement;
    }

    public String getMeteredUsage ()
    {
        return meteredUsage;
    }

    public void setMeteredUsage (String meteredUsage)
    {
        this.meteredUsage = meteredUsage;
    }

    public String getBlockOriginalContractDecrease ()
    {
        return blockOriginalContractDecrease;
    }

    public void setBlockOriginalContractDecrease (String blockOriginalContractDecrease)
    {
        this.blockOriginalContractDecrease = blockOriginalContractDecrease;
    }

    public String getBlockContractDecrease ()
    {
        return blockContractDecrease;
    }

    public void setBlockContractDecrease (String blockContractDecrease)
    {
        this.blockContractDecrease = blockContractDecrease;
    }

    public String getBlockContractIncrease ()
    {
        return blockContractIncrease;
    }

    public void setBlockContractIncrease (String blockContractIncrease)
    {
        this.blockContractIncrease = blockContractIncrease;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [amount = "+amount+", unit = "+unit+", increment = "+increment+", minUnits = "+minUnits+", pricePerIncrement = "+pricePerIncrement+", meteredUsage = "+meteredUsage+", blockOriginalContractDecrease = "+blockOriginalContractDecrease+", blockContractDecrease = "+blockContractDecrease+", blockContractIncrease = "+blockContractIncrease+"]";
    }
}
			