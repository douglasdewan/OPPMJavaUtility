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
public enum PSPORTFOLIO_TYPE {
    PTYP_NONE(0), //This is an illegal value 
    PTYP_ITEM(1), // 1 This is an Item, not a Portfolio 
    PTYP_PROJECTS(2), // 2 This is a Portfolio of Items 
    PTYP_PORTFOLIOS(3); // 3 This is a Portfolio of Portfolios 
    
    private final Integer iPortfolioTypeVaue;

    private PSPORTFOLIO_TYPE(Integer iPortfolioTypeValueIn) {
        this.iPortfolioTypeVaue = iPortfolioTypeValueIn;
    }

}
