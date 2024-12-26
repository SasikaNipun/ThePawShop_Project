
package Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class manageCashierDetails_Ctrl_ extends manageProductDetails_Ctrl_{

    @Override
    public void manageTable_(JTable tblMngCashierPage_M_) {
    String[] columnNames = {"ID", "Name", "NIC", "DOB", "Gender"};


    DefaultTableModel model = new DefaultTableModel(columnNames, 0);

    try {

        File file = new File("CashierDetailsDB.txt");
        BufferedReader MC = new BufferedReader(new FileReader(file));
        String line;


        while ((line = MC.readLine()) != null) {

            String[] CashierData = line.split(",");


            if (CashierData.length == 8) {
                String CashierID = CashierData[0].trim();
                String FirstName = CashierData[1].trim();
                String LastName = CashierData[2].trim();
                String NIC = CashierData[3].trim();
                String DOB = CashierData[4].trim();
                String Gender = CashierData[5].trim();


                model.addRow(new Object[]{CashierID, FirstName + " " + LastName, NIC, DOB, Gender});
            }
        }

        MC.close();
    } catch (IOException e) {

        e.printStackTrace();
    }


    tblMngCashierPage_M_.setModel(model);
}
 
}
