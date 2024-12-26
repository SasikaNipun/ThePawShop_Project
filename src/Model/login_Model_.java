
package Model;

public class login_Model_ {
    private String UsernameM;
    private String PasswordM;
    
    //@overloarding
    public login_Model_(String Username, String Password){
        this.UsernameM = Username;
        this.PasswordM = Password;
    }
    
    //@overloarding
    public login_Model_ (){
        this.UsernameM = "Admin";
        this.PasswordM = "admin";
    } 
    
    public String getUsername(){
        return UsernameM;
    }
    
    public String getPassword(){
        return PasswordM;
    }
    
    
}
