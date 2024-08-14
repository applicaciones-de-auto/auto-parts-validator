/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.guanzon.auto.validator.parts;

/**
 *
 * @author Arsiela
 */
public class ValidatorFactory {
    
    public enum TYPE{
        Inventory_Master,
        Inventory_Model,
        Inventory_Model_Year
    }
    
    public static ValidatorInterface make(ValidatorFactory.TYPE foType, Object foValue){
        switch (foType) {
            case Inventory_Master:
                return new Validator_Inventory_Master(foValue);
            case Inventory_Model:
                return new Validator_Inventory_Model(foValue);
            case Inventory_Model_Year:
                return new Validator_Inventory_Model_Year(foValue);
            default:
                return null;
        }
    }
    
    
}
