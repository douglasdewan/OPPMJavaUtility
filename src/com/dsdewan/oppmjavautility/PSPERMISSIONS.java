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
public enum PSPERMISSIONS {
    PRMS_NONE(0),
    PRMS_READ(1),
    PRMS_EDIT(4),
    PRMS_DELETE(8);
    
    private final Integer iPermissionsValue;
    
    private PSPERMISSIONS(Integer iPermissionsValueIn){
        this.iPermissionsValue = iPermissionsValueIn;
    }

}
