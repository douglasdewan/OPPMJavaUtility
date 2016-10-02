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
public enum PSPHASE_STATUS {
    PHSTS_NONE(0), //This value is illegal when calling APIs 
    PHSTS_NOT_STARTED(1),
    PHSTS_CURRENT_PHASE(2),
    PHSTS_FINISHED(3),
    PHSTS_SKIPPED(4);
    
    private final Integer iPhaseStatusValue;
    
    private PSPHASE_STATUS(Integer iPhaseStatusValueIn){
        this.iPhaseStatusValue = iPhaseStatusValueIn;
    }

}
