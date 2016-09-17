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
public enum PSCATEGORY_TYPE {
    CTYP_NONE(0),
    CTYP_VALUE(1),
    CTYP_INDICATOR(2),
    CTYP_BOTH(3);
    
    private Integer iCategoryTypeValue;
    
    private PSCATEGORY_TYPE(Integer iCategoryTypeValueIn){
        this.iCategoryTypeValue = iCategoryTypeValueIn;
    }
     
}
