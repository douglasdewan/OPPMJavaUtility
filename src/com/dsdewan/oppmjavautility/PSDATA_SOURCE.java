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
public enum PSDATA_SOURCE {
    DSRC_NONE(0),
    DSRC_MANUAL(1),
    DSRC_CALCULATED(2),
    DSRC_IMPORTED(3);
    
    private final Integer iDataSourceValue;
    
    private PSDATA_SOURCE(Integer iDataSourceValueIn){
        this.iDataSourceValue = iDataSourceValueIn;
    }

}
