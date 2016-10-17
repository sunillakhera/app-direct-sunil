package com.appdirect.domain;
public class Subscription
{
    private String id;

    private Product product;

    private String creationDate;

    private Edition edition;

    private Order order;

    private String status;

    private String maxUsers;

    private Company company;

    private String externalAccountId;

    private User user;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public Product getProduct ()
    {
        return product;
    }

    public void setProduct (Product product)
    {
        this.product = product;
    }

    public String getCreationDate ()
    {
        return creationDate;
    }

    public void setCreationDate (String creationDate)
    {
        this.creationDate = creationDate;
    }

    public Edition getEdition ()
    {
        return edition;
    }

    public void setEdition (Edition edition)
    {
        this.edition = edition;
    }

    public Order getOrder ()
    {
        return order;
    }

    public void setOrder (Order order)
    {
        this.order = order;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public String getMaxUsers ()
    {
        return maxUsers;
    }

    public void setMaxUsers (String maxUsers)
    {
        this.maxUsers = maxUsers;
    }

    public Company getCompany ()
    {
        return company;
    }

    public void setCompany (Company company)
    {
        this.company = company;
    }

    public String getExternalAccountId ()
    {
        return externalAccountId;
    }

    public void setExternalAccountId (String externalAccountId)
    {
        this.externalAccountId = externalAccountId;
    }

    public User getUser ()
    {
        return user;
    }

    public void setUser (User user)
    {
        this.user = user;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", product = "+product+", creationDate = "+creationDate+", edition = "+edition+", order = "+order+", status = "+status+", maxUsers = "+maxUsers+", company = "+company+", externalAccountId = "+externalAccountId+", user = "+user+"]";
    }
}