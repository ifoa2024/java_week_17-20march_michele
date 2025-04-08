import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class App {

    static final String connection_db = "jdbc:mysql://localhost:3306/db?user=root&password=root";
    public static void main(String[] args) throws Exception {
        //forName è un metodo statico della classe Class che attiva i driver tramite una stringa di connessione
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(connection_db);   

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM products");

        while (resultSet.next()) {
            // System.out.println(resultSet.getString("name") + " " + resultSet.getString("price") + " euro");

            System.out.println(resultSet.getString(1));
            System.out.println(resultSet.getString(2));
            System.out.println(resultSet.getString(3));
        }
    }
    }

