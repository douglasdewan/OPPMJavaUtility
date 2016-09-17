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
public enum PSFIELDS {

    FLD_NAME (1),
    FLD_LIFECYCLE (2),
    FLD_STARTDATE (4), 
    FLD_ENDDATE (8), 
    FLD_DESCRIPTION (16), 
    FLD_STATUS (32), 
    FLD_TYPE (64), 
    FLD_PHASES (128), 
    FLD_SCOPE (256), 
    FLD_QUERY (512), 
    FLD_PERIODIC_UPDATE (1024), 
    FLD_MANAGER (2048), 
    FLD_CONTAINER (4096), 
    FLD_ALL (32767);
    
    private final Integer iCodeValue;
    
    private PSFIELDS(Integer iCodeValueIn){
        this.iCodeValue = iCodeValueIn;
    }

}
