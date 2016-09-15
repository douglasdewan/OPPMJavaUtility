/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dsdewan.oppmjavautility;

/**
 *
 * @author Doug DeWan
 */
public class PsPortfoliosItemInfo {
    private String sName, sUCI, sLifeCycle, sStartDate, sEndDate, sDescription;
    private String sManager, sContainerUCI;
    private Long lProsightID, lContainerProSightID, lCalculationLevel;
    private PORTFOLIO_TYPE psPortfolioType;
    private OPEN_CLOSED_STATUS psOpen_Closed_Status;
    private boolean bIsContainerRoot;
    
    public void setItemName(String sNameIn){
        this.sName = sNameIn;
    }
    
    public String getItemName(){
        return this.sName;
    }
    
    public void setUCI(String sUCIIn){
        this.sUCI = sUCIIn;
    }
    
    public String getUCI(){
        return this.sUCI;
    }
    
    public void setLifeCycle(String sLifeCycleIn){
        this.sLifeCycle = sLifeCycleIn;
    }
    
    public String getLifeCycle(){
        return this.sLifeCycle;
    }
    
    public void setStartDate(String sStartDateIn){
        this.sStartDate = sStartDateIn;
    }
    
    public String getStartDate(){
        return this.sStartDate;
    }
    
    public void setEndDate(String sEndDateIn){
        this.sEndDate = sEndDateIn;
    }
    
    public String getEndDate(){
        return this.sEndDate;
    }
    
    public void setDescription(String sDescriptionIn){
        this.sDescription = sDescriptionIn;
    }
    
    public String getDescription(){
        return this.sDescription;
    }
    
    public void setManager(String sManagerIn){
        this.sManager = sManagerIn;
    }
    
    public String getManager(){
        return this.sManager;
    }
    
    public void setContainerUCI(String sContainerUCIIn){
        this.sContainerUCI = sContainerUCIIn;
    }
    
    public String getContainerUCI(){
        return this.sContainerUCI;
    }
}
