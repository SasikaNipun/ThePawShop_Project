
package Controller;

import Model.manageCashier_Model_;
import Model.manageProduct_Model_;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class manage_Ctrl_ {
    // Manage Product Page by Manager @overloarding
    public void manage(String PID, String PName, String PCategory, String PPrice){
        manageProduct_Model_ mngP = new manageProduct_Model_(PID, PName, PCategory, PPrice);
        
        String file = "ProductDetailsDB.txt";
        try{
            File F1 = new File(file);
            if(!F1.exists()){
                F1.createNewFile();
            }
            
            try(FileWriter Add = new FileWriter(file,true)){
                Add.write(mngP.getProductID() + "," + mngP.getProductName() + "," + mngP.getProductCategory() + "," + mngP.getProductPrice() + "\n");
            }
            catch(IOException e){
                JOptionPane.showMessageDialog(null, "Error Writing File!");
            }
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error Creating File!");
        }
    }
    
    
    // Manage Cashier Page by Manager   @overloarding
    public void manage(String CashierID, String firstName, String lastName, String NIC, String DOB, String Gender, String cUsername, String cPassword){
        manageCashier_Model_ mngC = new manageCashier_Model_(CashierID, firstName, lastName, NIC, DOB, Gender, cUsername, cPassword);
        
        String file = "CashierDetailsDB.txt";
        String file2 = "CashierLoginData.txt";
        
        try{
            File F1 = new File(file);
            File F2 = new File(file2);
            if(!F1.exists() && !F2.exists()){
                F1.createNewFile();
                F2.createNewFile();
            }
            
            try(FileWriter Add = new FileWriter(file,true); FileWriter Add2 = new FileWriter(file2,true)){
                Add.write( mngC.getCashierID() + "," + mngC.getFirstName() + "," + mngC.getLastName() + "," + mngC.getNIC() + "," + mngC.getDOB() + "," + mngC.getGender() + "," + mngC.getUsername() + "," + mngC.getPassword() + "\n");
                Add2.write(mngC.getUsername() + "," + mngC.getPassword() + "\n");
            }
            catch(IOException e){
                JOptionPane.showMessageDialog(null, "Error Writing File!");
            }
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error Creating File!");
        }
    }
    
    
  
    
}
