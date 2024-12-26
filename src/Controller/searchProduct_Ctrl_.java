
package Controller;

import Model.search_Model_;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class searchProduct_Ctrl_ {
    

   
   
    public void Search(String SearchData, JTable searchTable) {
        
        String DBFileName = "ProductDetailsDB.txt";
        String [] columnNames = {"Product ID", "Product Name", "Product Category", "Product Price"};
        
        
        search_Model_ S1 = new search_Model_(SearchData);
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        
    try{

        File file = new File(DBFileName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;


        while ((line = br.readLine()) != null) {

            String[] sData = line.split(",");
            
            if (sData.length == 4) {
                
            for (int i = 0; i<4; i++){
                
            String S = sData[i].trim();
            
            if(S.equals(S1.getsearchData())){
                model.addRow(sData);
                
            }
            }


            }
        }
        }

    catch (IOException e) {
            JOptionPane.showMessageDialog((Component)null, "Error: Can't find Data");
    }
    
    searchTable.setModel(model);
}
}
