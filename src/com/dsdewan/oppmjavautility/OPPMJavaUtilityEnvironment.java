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
public class OPPMJavaUtilityEnvironment {
    private String sUser, sPassword, sServer, sWSLocation, sCookie;
    private Integer iTimeOut;
    
    public void setUserName(String sUserIn){
        this.sUser = sUserIn;
    }
    
    public String getUserName(){
        return this.sUser;
    }
    
    public void setPassword(String sPasswordIn){
        this.sPassword = sPasswordIn;
    }
    
    public String getPassword(){
        return this.sPassword;
    }
    
    public void setTimeOut(Integer iTimeOutIn){
        this.iTimeOut = iTimeOutIn;
    }
    
    public Integer getTimeOut(){
        return this.iTimeOut;
    }
    
    public void setServer(String sServerIn){
        this.sServer = sServerIn;
    }
    
    public String getServer(){
        return this.sServer;
    }
    
    public void setWebServiceLocation(String sWSLocationIn){
        this.sWSLocation = sWSLocationIn;
    }
    
    public String getWebServiceLocation(){
        return this.sWSLocation;
    }
    
    public void setLoginCookie(String sLoginCookieIn){
        this.sCookie = sLoginCookieIn;
        this.sPassword = null;
    }
    
    public String getLoginCookie(){
        return this.sCookie;
    }
}
