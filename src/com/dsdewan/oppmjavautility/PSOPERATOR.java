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
public enum PSOPERATOR {
    OP_NONE(0),
    OP_HAS_VALUE(1),
    OP_NO_VALUE(2),
    OP_EQUAL(3),
    OP_NOT_EQUAL(4),
    OP_GREATER_THAN(5),
    OP_LESS_THAN(6),
    OP_GREATER_THAN_OR_EQUAL(7),
    OP_LESS_THAN_OR_EQUAL(8),
    OP_CONTAIN(9),
    OP_NOT_CONTAIN(10),
    OP_BEGINS_WITH(11),
    OP_ENDS_WITH(12);
    
    private final Integer iOperatorValue;
    
    private PSOPERATOR(Integer iOperatorValueIn){
        this.iOperatorValue = iOperatorValueIn;
    }

}
