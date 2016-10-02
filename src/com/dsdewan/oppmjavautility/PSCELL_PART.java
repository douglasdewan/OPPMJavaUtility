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
public enum PSCELL_PART {
    CPRT_NONE(-2), 
    CPRT_VALUE(0),
    CPRT_INDICATOR_COLOR(2);
    
    private final Integer iCellPartValue;
    
    private PSCELL_PART(Integer iCellPartValueIn){
        this.iCellPartValue = iCellPartValueIn;
    }
}
