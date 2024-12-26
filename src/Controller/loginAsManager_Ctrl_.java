
package Controller;

import Model.login_Model_;
import View.mainFunctioPage;
import View.mainLoginPage;
import javax.swing.JOptionPane;

public class loginAsManager_Ctrl_ extends login_Ctrl {
    boolean Success = false;
    
    @Override
    public void login(String Username, String Password ){
        login_Model_ LM1 = new login_Model_();
        
        mainFunctioPage V1 = new mainFunctioPage();

        
        if ( Username.equals(LM1.getUsername()) 
            && Password.equals(LM1.getPassword())){
            V1.setVisible(true);
            
            Success = true;
        }
        
    }
    
    public boolean getSuccess(){
        return Success;
    }
    
}
