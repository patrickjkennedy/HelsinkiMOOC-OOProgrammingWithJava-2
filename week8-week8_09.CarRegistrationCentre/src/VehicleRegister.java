
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pkennedy
 */
public class VehicleRegister {
            
    private HashMap<RegistrationPlate, String> register = new HashMap<RegistrationPlate, String>();

    public boolean add(RegistrationPlate plate, String owner){
        if (!register.containsKey(plate)){
            register.put(plate, owner);
            return true;
        } else{
            return false;
        }
    }
    
    public String get(RegistrationPlate plate){
        if (this.register.get(plate) == null){
            return null;
        } else {
            return this.register.get(plate);
        }
    }
    
    public boolean delete(RegistrationPlate plate){
        if (this.register.get(plate) == null){
            return false;
        } else{
            this.register.put(plate, null);
            return true;
        }
    }
    
    public void printRegistrationPlates(){
        for(RegistrationPlate plate : this.register.keySet()){
            System.out.println(plate);
        }
    }
    
    public void printOwners(){
        ArrayList<String> owners = new ArrayList<String>();
        for(RegistrationPlate plate : this.register.keySet()){
            String owner = this.register.get(plate);
            if(!owners.contains(owner)){
                owners.add(owner);
            }
        }
        for (String owner : owners){
            System.out.println(owner);
        }
    }
    
}
