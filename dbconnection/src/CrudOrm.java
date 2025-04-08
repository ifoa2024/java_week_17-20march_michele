import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CrudOrm {
    Product product;

    static final String connection_db = "jdbc:mysql://localhost:3306/db?user=root&password=root";
    private Connection connection;
    private Statement statement;

    public CrudOrm() throws Exception {
        connection = DriverManager.getConnection(connection_db);
        statement = connection.createStatement();
    }


    public Product getProductByName(String name) throws Exception {
         StringBuilder query = new StringBuilder("SELECT * FROM products WHERE name = '" + name + "'");

         ResultSet resultSet = this.statement.executeQuery(query.toString());

         Product product = new Product();

         if (resultSet.next()) {
            product.setId(resultSet.getInt("id"));
            product.setName(resultSet.getString("name"));
            product.setPrice(resultSet.getFloat("price"));
         }

         return product;
    }

    // public Product addProduct(String name) throws Exception {
    //     StringBuilder query = new StringBuilder("INSERT INTO products (name) VALUES ('" + name + "')");

    //     this.statement.executeUpdate(query.toString());

    //     return getProductByName(name);

    // }
}
