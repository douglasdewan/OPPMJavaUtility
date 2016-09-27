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
public enum PSITEM_TYPE {
    ITYP_NONE(0),
    ITYP_ITEM(1),
    ITYP_PORTFOLIO_OF_ITEMS(2),
    ITYP_PORTFOLIO_OF_PORTFOLIOS(3);
    
    private final Integer iItemTypeValue;
    
    private PSITEM_TYPE(Integer iItemTypeValueIn){
        this.iItemTypeValue = iItemTypeValueIn;
    }
}