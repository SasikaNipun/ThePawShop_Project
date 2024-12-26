
package Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class manageProductDetails_Ctrl_ {
    
    public void manageTable_(JTable tblMngProductPage_M_) {

    String[] columnNames = {"Product ID", "Product Name", "Product Category", "Product Price"};


    DefaultTableModel model = new DefaultTableModel(columnNames, 0);

    try {

        File file = new File("ProductDetailsDB.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;


        while ((line = br.readLine()) != null) {

            String[] productData = line.split(",");

            if (productData.length == 4) {
                String ProductId = productData[0].trim();
                String ProductName = productData[1].trim();
                String ProductCategory = productData[2].trim();
                String ProductPrice = productData[3].trim();


                model.addRow(new Object[]{ProductId, ProductName,ProductCategory,ProductPrice});
            }
        }

        br.close();
    } catch (IOException e) {

        e.printStackTrace();
    }


    tblMngProductPage_M_.setModel(model);
}
}
