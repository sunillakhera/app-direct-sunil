package com.appdirect.domain;

public class Contract
{
    private String blockContractUpgrades;

    private String blockSwitchToShorterContract;

    private String blockContractDowngrades;

    public String getBlockContractUpgrades ()
    {
        return blockContractUpgrades;
    }

    public void setBlockContractUpgrades (String blockContractUpgrades)
    {
        this.blockContractUpgrades = blockContractUpgrades;
    }

    public String getBlockSwitchToShorterContract ()
    {
        return blockSwitchToShorterContract;
    }

    public void setBlockSwitchToShorterContract (String blockSwitchToShorterContract)
    {
        this.blockSwitchToShorterContract = blockSwitchToShorterContract;
    }

    public String getBlockContractDowngrades ()
    {
        return blockContractDowngrades;
    }

    public void setBlockContractDowngrades (String blockContractDowngrades)
    {
        this.blockContractDowngrades = blockContractDowngrades;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [blockContractUpgrades = "+blockContractUpgrades+", blockSwitchToShorterContract = "+blockSwitchToShorterContract+", blockContractDowngrades = "+blockContractDowngrades+"]";
    }
}
			
			
