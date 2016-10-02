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
public enum PSINDICATOR_TYPE {
    IND_NONE(0),
    IND_RED(1),
    IND_YELLOW(2),
    IND_GREEN(3);
    
    private final Integer iIndicatorValue;
    
    private PSINDICATOR_TYPE(Integer iIndicatorValueIn){
        this.iIndicatorValue = iIndicatorValueIn;
    }

}
