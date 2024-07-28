package package_1.package_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class connection_1 {
    public static final String url = "jdbc:mysql://localhost:3306/bills";
    public static final String username = "root";
    public static final String password = "20sd0128";

    connection_1() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection connection1 = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM system_bill WHERE id=? AND password=?";

            PreparedStatement preparedStatement = connection1.prepareStatement(query);
            preparedStatement.setString(1, frame_1.customerid);
            preparedStatement.setString(2, frame_1.password);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                frame_1.data1 = resultSet.getString("id");
                frame_1.data2 = resultSet.getString("password");
                frame_1.data3 = resultSet.getString("unit_consumed");
                frame_1.data4 = resultSet.getString("bill_month");
                frame_1.data5 = resultSet.getString("meter_number");
                frame_1.data6 = resultSet.getString("amount_to_pay");
                System.out.println(frame_1.data1);
                System.out.println(frame_1.data3);
                System.out.println(frame_1.data4);
                System.out.println(frame_1.data5);
                System.out.println(frame_1.data6);
            } else {
                System.out.println("Error404");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
