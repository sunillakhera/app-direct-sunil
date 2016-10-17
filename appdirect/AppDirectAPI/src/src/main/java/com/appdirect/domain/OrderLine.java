package com.appdirect.domain;

public class OrderLine
{
    private String id;

    private String unit;

    private String price;

    private String description;

    private String quantity;

    private String type;

    private String totalPrice;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getUnit ()
    {
        return unit;
    }

    public void setUnit (String unit)
    {
        this.unit = unit;
    }

    public String getPrice ()
    {
        return price;
    }

    public void setPrice (String price)
    {
        this.price = price;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getQuantity ()
    {
        return quantity;
    }

    public void setQuantity (String quantity)
    {
        this.quantity = quantity;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
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
        return "ClassPojo [id = "+id+", unit = "+unit+", price = "+price+", description = "+description+", quantity = "+quantity+", type = "+type+", totalPrice = "+totalPrice+"]";
    }
}
			