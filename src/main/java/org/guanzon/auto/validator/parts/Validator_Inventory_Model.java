/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.guanzon.auto.validator.parts;

import org.guanzon.appdriver.base.GRider;
import org.guanzon.auto.model.parts.Model_Inventory_Model;

/**
 *
 * @author Arsiela
 */
public class Validator_Inventory_Model implements ValidatorInterface {
    GRider poGRider;
    String psMessage;
    
    Model_Inventory_Model poEntity;

    public Validator_Inventory_Model(Object foValue) {
        poEntity = (Model_Inventory_Model) foValue;
    }

    @Override
    public void setGRider(GRider foValue) {
        poGRider = foValue;
    }

    @Override
    public boolean isEntryOkay() {
        if(poEntity.getStockID()== null) {
            psMessage = "Stock ID is not set.";
            return false;
        } else {
            if (poEntity.getStockID().isEmpty()){
                psMessage = "Stock ID is not set.";
                return false;
            }
        }
        
        if(poEntity.getEntryNo() == null) {
            psMessage = "Invalid Vehicle Model Entry No.";
            return false;
        } else {
            if (poEntity.getEntryNo() <= 0){
                psMessage = "Invalid Vehicle Model  Entry No.";
                return false;
            }
        }
        
        if(poEntity.getModelCde()== null) {
            psMessage = "Vehicle Model Code is not set.";
            return false;
        } else {
            if (poEntity.getModelCde().isEmpty()){
                psMessage = "Vehicle Model Code is not set.";
                return false;
            }
        }
        
        return true;
    }
    
    @Override
    public String getMessage() {
        return psMessage;
    }
    
}
