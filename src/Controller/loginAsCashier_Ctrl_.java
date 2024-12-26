
package Controller;

import Model.login_Model_;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class loginAsCashier_Ctrl_ extends login_Ctrl{
    
    boolean Success = false;

    @Override
    public void login(String Username, String Password) {
        login_Model_ C1 = new login_Model_(Username,Password);
        String file2 = "CashierLoginData.txt";
        try{
            BufferedReader C2 = new BufferedReader(new FileReader(file2));
            String line;
            
            while((line = C2.readLine())!= null){
                String CLogin[] = line.split(",");
                
                if(CLogin.length == 2){
                    String UN = CLogin[0].trim();
                    String PW = CLogin[1].trim();
                    if(C1.getUsername().equals(UN) && C1.getPassword().equals(PW)){
                        Success = true;
                    }
                }
            }
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "error!");
        }
    }
    
    public boolean getSuccess(){
        return Success;
    }
    
}
