/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.guanzon.auto.validator.parts;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.guanzon.appdriver.base.GRider;
import org.guanzon.auto.model.parts.Model_Inventory_Information;

/**
 *
 * @author Arsiela
 */
public class Validator_Inventory_Information implements ValidatorInterface {
    GRider poGRider;
    String psMessage;
    
    Model_Inventory_Information poEntity;

    public Validator_Inventory_Information(Object foValue) {
        poEntity = (Model_Inventory_Information) foValue;
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
        
        if(poEntity.getBarCode()== null) {
            psMessage = "Barcode is not set.";
            return false;
        } else {
            if (poEntity.getBarCode().isEmpty()){
                psMessage = "Barcode is not set.";
                return false;
            }
        }
        
        if(poEntity.getDescript()== null) {
            psMessage = "Description is not set.";
            return false;
        } else {
            if (poEntity.getDescript().isEmpty()){
                psMessage = "Description is not set.";
                return false;
            }
        }
        
        if(poEntity.getBriefDsc()== null) {
            psMessage = "Brief Description is not set.";
            return false;
        } else {
            if (poEntity.getBriefDsc().isEmpty()){
                psMessage = "Brief Description is not set.";
                return false;
            }
        }
        
//        if(poEntity.getAltBarCd()== null) {
//            psMessage = "Alternative Barcode is not set.";
//            return false;
//        } else {
//            if (poEntity.getAltBarCd().isEmpty()){
//                psMessage = "Alternative Barcode is not set.";
//                return false;
//            }
//        }
        
        if(poEntity.getCategCd1()== null) {
            psMessage = "Category is not set.";
            return false;
        } else {
            if (poEntity.getCategCd1().isEmpty()){
                psMessage = "Category is not set.";
                return false;
            }
        }
        
        if(poEntity.getBrandCde()== null) {
            psMessage = "Brand is not set.";
            return false;
        } else {
            if (poEntity.getBrandCde().isEmpty()){
                psMessage = "Brand is not set.";
                return false;
            }
        }
        
        if(poEntity.getMeasurID()== null) {
            psMessage = "Measure is not set.";
            return false;
        } else {
            if (poEntity.getMeasurID().isEmpty()){
                psMessage = "Measure is not set.";
                return false;
            }
        }
        
        if(poEntity.getInvTypCd()== null) {
            psMessage = "Inventory Type is not set.";
            return false;
        } else {
            if (poEntity.getInvTypCd().isEmpty()){
                psMessage = "Inventory Type is not set.";
                return false;
            }
        }
        
//        if(poEntity.getInvStat()== null) {
//            psMessage = "Inventory Status is not set.";
//            return false;
//        } else {
//            if (poEntity.getInvStat().isEmpty()){
//                psMessage = "Inventory Status is not set.";
//                return false;
//            }
//        }
//        
//        if(poEntity.getGenuine()== null) {
//            psMessage = "Inventory Genuine is not set.";
//            return false;
//        } else {
//            if (poEntity.getGenuine().isEmpty()){
//                psMessage = "Inventory Genuine is not set.";
//                return false;
//            }
//        }
        
        if(poEntity.getTrimBCde()== null) {
            psMessage = "Trim Barcode is not set.";
            return false;
        } else {
            if (poEntity.getTrimBCde().isEmpty()){
                psMessage = "Trim Barcode is not set.";
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
