
package Model;

public class manageCashier_Model_ {
   private String CashierID;
   private String FirstName;
   private String LastName;
   private String NIC;
   private String DOB;
   private String Gender;
   private String Username;
   private String Password;
   
   public manageCashier_Model_( String CID, String FName, String LName, String NIC, String DOB, String Gender, String UName, String PWord ){
       this.CashierID = CID;
       this.FirstName = FName;
       this.LastName = LName;
       this.NIC = NIC;
       this.DOB = DOB;
       this.Gender = Gender;
       this.Username = UName;
       this.Password = PWord;
   }
   
   public manageCashier_Model_(String FName, String LName, String NIC, String DOB){
       this.FirstName = FName;
       this.LastName = LName;
       this.NIC = NIC;
       this.DOB = DOB;

   }
   public String getCashierID(){
       return CashierID;
   }
   public String getFirstName(){
       return FirstName;
   }
   public String getLastName(){
       return LastName;
   }
   public String getNIC(){
       return NIC;
   }
   public String getDOB(){
       return DOB;
   }
   public String getGender(){
       return Gender;
   }
   public String getUsername(){
       return Username;
   }
   public String getPassword(){
       return Password;
   }
}
