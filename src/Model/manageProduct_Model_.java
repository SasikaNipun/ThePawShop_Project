
package Model;

public class manageProduct_Model_ {
    private String ProductID;
    private String ProductName;
    private String ProductCategory;
    private String ProductPrice;
    
    public manageProduct_Model_(String PID, String PName, String PCategory, String PPrice){
        this.ProductID = PID;
        this.ProductName = PName;
        this.ProductCategory = PCategory;
        this.ProductPrice = PPrice;
    }
    
    public String getProductID(){
        return ProductID;
    }
    public String getProductName(){
        return ProductName;
    }
    public String getProductCategory(){
        return ProductCategory;
    }
    public String getProductPrice(){
        return ProductPrice;
    }
}
