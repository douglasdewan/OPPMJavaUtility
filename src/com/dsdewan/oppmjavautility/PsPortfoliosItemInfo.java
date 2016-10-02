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
    private String sCommonIdCategory;
    private String sId;
    private String sName;
    private String sLifeCycle;
    private String sStartDate;
    private String sEndDate;
    private String sDescription;
    private PSOPEN_CLOSED_STATUS psOpen_Closed_Status;
    private String sManager;
    private String sContainerId;
    private PSFIELDS lUpdateFlags;
    private Long lProsightID;
    private boolean bIsContainerRoot;
    
    public void setCommonIdCategory(String sCommonIdCategoryIn){
        this.sCommonIdCategory = sCommonIdCategoryIn;
    }
    
    public String getCommonIdCategory(){
        return this.sCommonIdCategory;
    }
    public void setName(String sNameIn){
        this.sName = sNameIn;
    }
    
    public String getName(){
        return this.sName;
    }
    
    public void setId(String sIdIn){
        this.sId = sIdIn;
    }
    
    public String getId(){
        return this.sId;
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
    
    public void setContainerId(String sContainerIdIn){
        this.sContainerId = sContainerIdIn;
    }
    
    public String getContainerId(){
        return this.sContainerId;
    }
}
