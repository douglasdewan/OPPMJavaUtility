/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dsdewan.oppmjavautility;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Doug DeWan
 */
public class OPPMJavaUtility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OPPMJavaUtilityEnvironment oppmWSEnvs = new OPPMJavaUtilityEnvironment();
        
        oppmWSEnvs.setUserName("admin");
        oppmWSEnvs.setPassword("");
        
        oppmWSEnvs.setTimeOut(600);
        oppmWSEnvs.setServer("http://oppm");
        oppmWSEnvs.setWebServiceLocation("/prosightWS");
        
        OPPMWSClient oWSClient = new OPPMWSClient();
        
        try {
            System.out.println("Login Successful: " + oWSClient.Login(oppmWSEnvs));
            System.out.println("Login Cookie: " + oppmWSEnvs.getLoginCookie());
        } catch (Exception ex) {
            Logger.getLogger(OPPMJavaUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
