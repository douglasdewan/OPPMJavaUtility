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
public enum PSCELL_UPDATE_FIELD {
    CFLD_VALUE(1), 
    CFLD_INDICATOR(2), 
    CFLD_ANNOTATION(4),
    CFLD_ALL(7);
    
    private final Integer iCellUpdateFieldValue;
    
    private PSCELL_UPDATE_FIELD(Integer iCellUpdateFieldValueIn){
        this.iCellUpdateFieldValue = iCellUpdateFieldValueIn;
    }

}
