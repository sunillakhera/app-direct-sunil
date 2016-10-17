package com.appdirect.domain;

public class Costs
{
    private Cost[] cost;

    public Cost[] getCost ()
    {
        return cost;
    }

    public void setCost (Cost[] cost)
    {
        this.cost = cost;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [cost = "+cost+"]";
    }
}
