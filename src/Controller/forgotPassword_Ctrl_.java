
package Controller;

import Model.login_Model_;
import Model.manageCashier_Model_;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class forgotPassword_Ctrl_ {

    public void ForgotP(String FName, String LName, String NIC, String DOB) {
        manageCashier_Model_ C1 = new manageCashier_Model_(FName, LName, NIC, DOB);
        String file = "CashierDetailsDB.txt";
        try{
            BufferedReader C2 = new BufferedReader(new FileReader(file));
            String line;
            
            while((line = C2.readLine())!= null){
                String CLogin[] = line.split(",");
                
                if(CLogin.length == 7){
                    String FN = CLogin[0].trim();
                    String LN = CLogin[1].trim();
                    String nic = CLogin[2].trim();
                    String dob = CLogin[3].trim();
                    String Gender = CLogin[4].trim();
                    String Username = CLogin[5].trim();
                    String Password = CLogin[6].trim();
                    if(C1.getFirstName().equals(FN) && C1.getLastName().equals(LN) && C1.getNIC().equals(nic) && C1.getDOB().equals(dob)){
                        JOptionPane.showMessageDialog(null, "Username - " + Username + "\n" + "Password - " + Password);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Error - Invalid Details");
                        break;
                    }
                    
                }
            }
        }
        
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "error!");
        }

    }

}
