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
public enum PSCATEGORY_VALUE_TYPE {
    CVTYP_NONE(0),
    CVTYP_INT(1), 
    CVTYP_FLOAT(2), 
    CVTYP_TEXT(4),
    CVTYP_DATETIME(5), 
    CVTYP_VALUELIST(6), 
    CVTYP_USER(7);

    private final Integer iCategoryValueType;

    private PSCATEGORY_VALUE_TYPE(Integer iCategoryValueTypeIn){
        this.iCategoryValueType = iCategoryValueTypeIn;
    }
}
