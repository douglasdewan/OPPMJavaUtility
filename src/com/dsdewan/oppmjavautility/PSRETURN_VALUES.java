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
public enum PSRETURN_VALUES {
    ERR_OK(0,"Successful completion"),
    ERR_INTERNAL(1,"Internal PPM error"),
    ERR_COMMON_ID_ALREADY_EXISTS(2,"Item with this ID already exists in PP"),
    ERR_COMMON_ID_UNKNOWN(3,"Item with this ID does not exist in PP"),
    ERR_MULTIPLE_COMMON_ID(4,"Multiple Items with this GUID exist in PP"),
    ERR_NOT_ITEM(5,"This ID belongs to a portfolio (not item) in PP"),
    ERR_NO_NAME_GIVEN(6,"Empty Name given (when creating an item)"),
    ERR_PORTFOLIO_UNKNOWN(7,"This portfolio does not exist in PP"),
    ERR_PORTFOLIO_NOT_QBP(8,"This portfolio is not Query Based in PP"),
    ERR_NAME_ALREADY_EXISTS(9,"The Name for the item is in use"),
    ERR_NOT_PORTFOLIO(10,"This ID belongs to an item (not portfolio) in PP"),
    ERR_PORTFOLIO_TYPE_MISMATCH(11,"Attempt to add item to a portfolio of portfolios, or a portfolio to a portfolio of items"),
    ERR_PHASE_NOT_FOUND(12,"No phase with given name in system"),
    ERR_NO_SUCH_PHASE_FOR_ITEM(13,"No phase with given name for the selected item."),
    ERR_NO_COMMON_ID(14,"No CommonID specified"),
    ERR_ILLEGAL_STATUS(15,"Value for lStatus parameter illegal"),
    ERR_ILLEGAL_PORTFOLIO_TYPE(16,"Value for lType parameter illegal"),
    ERR_LIFE_CYCLE_NOT_FOUND(17,"No Life Cycle with given name exists"),
    ERR_ILLEGAL_GUID(18,"GUID given is not in correct format ({xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx})"),
    ERR_NO_PHASES_FOR_LIFE_CYCLE(19,"No phases specified for Life Cycle"),
    ERR_ILLEGAL_DATE(20,"Date field has wrong format (should be mm/dd/yyyy)"),
    ERR_ILLEGAL_DESCRIPTION(21,"Description field too long"),
    ERR_ITEM_DOES_NOT_EXIST(22,"Item/portfolio does not exist"),
    ERR_NO_VALUE_LIST_NAME(23,"Empty value list name specified"),
    ERR_VALUE_LIST_DOES_NOT_EXIST(24,"Value List with given name does not exist"),
    ERR_CANNOT_UPDATE_SYSTEM_VALUE_LIST(25,"Attempt to update system value list"),
    ERR_DUPLICATE_TEXT_IN_VALUE_LIST(26,"Duplicate Text in value list"),
    ERR_DUPLICATE_ID_IN_VALUE_LIST(27,"Duplicate ID in value list"),
    ERR_VALUE_DOES_NOT_EXIST(28,"Value list value does not exist (when updating cell with value from value list and specifying 'displayValue')"),
    ERR_VALUE_ID_NOT_INTEGER(29,"Value ID is not an integer (when updating cell with value from value list, and specifying 'value')"),
    ERR_ILLEGAL_NAME(30,"Name field too long (limit is mentioned in the detailed error message)"),
    ERR_CATEGORY_NOT_SUPPORTED(31,"Update/query of this category not supported"),
    ERR_CATEGORY_UNKNOWN(32,"Category does not exist"),
    ERR_ILLEGAL_OPERATOR(33,"Relational Operator does not match Category and Cell Part"),
    ERR_VALUE_NOT_INTEGER(34,"Value is not integer format"),
    ERR_VALUE_NOT_NUMERIC(35,"Value is not numeric format"),
    ERR_PORTFOLIO_NOT_IN_SCOPE(36,"Portfolio may not appear in QBP Scope"),
    ERR_ILLEGAL_INDICATOR(37,"Indicator not in valid range"),
    ERR_BAD_PARAMETER(38,"One of the parameters does not comply with the specifications."),
    ERR_ILLEGAL_DEPENDENCY(39,"Adding this dependency would create a circular dependency."),
    ERR_ADD_NEW_NEVER_CALLED(40,"Some methods (such as GetLastID) are only valid after AddNew (or AddNewEx) was called."),
    ERR_SECURITY_NOT_SET(41,"SetSecurity was not called for this object."),
    ERR_SECURITY_VIOLATION(42,"Attempt to perform an operation or query that the logged in user does not have permission for."),
    ERR_LIFE_CYCLE_IN_PORTFOLIO(43,"Cannot delete a life cycle since it is used by an item/portfolio"),
    ERR_PHASE_IN_LIFE_CYCLE(44,"Cannot delete a phase since it is used in a life cycle"),
    ERR_NO_DELETE_PERMISSION(45,"Logged in user has no permissions for attempted delete operation"),
    ERR_NO_EDIT_PERMISSION_ON_PARENT(46,"Logged in user has no edit permissions on the parent of the object attempted for delete"),
    ERR_NO_FURTHER_DETAILS_AVAILABLE(47,"Delete operation cannot be carried out"),
    ERR_DUPLICATE_PHASE_IN_LIFE_CYCLE(48,"Attempt to create a life cycle with the same phase appearing more than once"),
    ERR_PHASE_ACTUAL_START_DATE_LATER_THAN_END_DATE(49,"Attempt to set actual start date of item/portfolio phase later than the end date"),
    ERR_PHASE_PLANED_START_DATE_LATER_THEN_END_DATE(50,"Attempt to set planed start date of item/portfolio phase later than the end date"),
    ERR_MORE_THAN_ONE_CURRENT_PHASE_FOR_ITEM(51,"Attempt to set the status of an item/portfolio phase as 'CURRENT' without changing the status of the phase that previously had this status"),
    ERR_MENU_XML_DOES_NOT_CONFORM_TO_XSD(52,"Menu XML does not conform to Schema Definition"),
    ERR_SETTINGS_DO_NOT_EXIST(53,"Settings requested do not exist"),
    ERR_SETTINGS_ALREADY_EXIST(54,"Settings with this name already exist"),
    ERR_EXCEEDED_AUTHORIZED_NUMBER_OF_USERS(56,"You have exceeded your authorized number of users and are in violation of your license");
    
    private final Integer iReturnValue;
    private final String sReturnValueDescription;
    
    private PSRETURN_VALUES(Integer iReturnValueIn, String sReturnValueDescriptionIn){
        this.iReturnValue = iReturnValueIn;
        this.sReturnValueDescription = sReturnValueDescriptionIn;
    }

}
