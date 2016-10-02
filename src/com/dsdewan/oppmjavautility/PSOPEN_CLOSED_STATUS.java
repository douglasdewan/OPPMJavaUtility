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
public enum PSOPEN_CLOSED_STATUS {
    OCSTS_NONE(0),
    OCSTS_OPEN(1), 
    OCSTS_CLOSED(2), 
    OCSTS_CANDIDATE(3);
    
    private final Integer iStatusValue;
    
    private PSOPEN_CLOSED_STATUS(Integer iStatusValueIn){
        this.iStatusValue = iStatusValueIn;
    }

    
}
