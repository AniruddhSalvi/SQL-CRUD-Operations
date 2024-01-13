package myPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Operation {
    Scanner sc =  new Scanner(System.in);
    public void createData() {
        try {
            Connection con = DB.connect();
            String query ="INSERT into class (id,name,date,cyl) VALUES (?,?,?,?)";

            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, 4);
            pstm.setString(2, "Kakashi");
            pstm.setString(3, "04/01/2024");
            pstm.setInt(4, 10);

            pstm.executeUpdate();
            System.out.println("Data Inserted Successfully.");
            con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void readData() {
        try {
            Connection con = DB.connect();
            String query ="SELECT * FROM class";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()) {
                System.out.println("Id = "+rs.getInt(1));
                System.out.println("Name = "+rs.getString(2));
                System.out.println("Date = "+rs.getString(3));
                System.out.println("Cylinder = "+rs.getInt(4));
                System.out.println();
            }
            System.out.println("Data Read Successfully.");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }       
    }

    public void updateData() {
        try {
            Connection con = DB.connect();
            String query ="UPDATE class set id = ? where name = ?";

            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, 5);
            pstm.setString(2, "Kakashi");

            pstm.executeUpdate();
            System.out.println("Data Updated Successfully.");
            con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteData() {
        try {
            Connection con = DB.connect();
            int id = sc.nextInt();
            String query = "DELETE FROM class WHERE id=?";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, id);

            if(pstm.executeUpdate() > 0) {
                System.out.println("Record Deleted Successfully.");
            } else {
                System.out.println("No Record Found.");
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
