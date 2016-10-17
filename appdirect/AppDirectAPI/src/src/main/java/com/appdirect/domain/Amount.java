package com.appdirect.domain;

public class Amount
{
    private String CHF;

    private String USD;

    private String CAD;

    private String SEK;

    public String getCHF ()
    {
        return CHF;
    }

    public void setCHF (String CHF)
    {
        this.CHF = CHF;
    }

    public String getUSD ()
    {
        return USD;
    }

    public void setUSD (String USD)
    {
        this.USD = USD;
    }

    public String getCAD ()
    {
        return CAD;
    }

    public void setCAD (String CAD)
    {
        this.CAD = CAD;
    }

    public String getSEK ()
    {
        return SEK;
    }

    public void setSEK (String SEK)
    {
        this.SEK = SEK;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [CHF = "+CHF+", USD = "+USD+", CAD = "+CAD+", SEK = "+SEK+"]";
    }
}
			
			
