import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connector {
    public int connect() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "soumya", "9432129423");
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM product";

            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                System.out.println("PRODUCT-NAME:"
                        + resultSet.getString("product"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }



}