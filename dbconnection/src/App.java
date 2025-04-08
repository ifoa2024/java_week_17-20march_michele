import java.util.Scanner;

public class App {

    static final String connection_db = "jdbc:mysql://localhost:3306/db?user=root&password=root";
    public static void main(String[] args) throws Exception {
        //forName è un metodo statico della classe Class che attiva i driver tramite una stringa di connessione
        // Class.forName("com.mysql.cj.jdbc.Driver");
        // Connection connection = DriverManager.getConnection(connection_db);   

        // Statement statement = connection.createStatement();
        // ResultSet resultSet = statement.executeQuery("SELECT * FROM products");

        // while (resultSet.next()) {
        //     // System.out.println(resultSet.getString("name") + " " + resultSet.getString("price") + " euro");

        //     System.out.println(resultSet.getString(1));
        //     System.out.println(resultSet.getString(2));
        //     System.out.println(resultSet.getString(3));
        // }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Riscerca un prodotto per nome: ");
        String type = scanner.nextLine();
        
        CrudOrm crudOrm = new CrudOrm();
        Product product = crudOrm.getProductByName(type);
        if (product.getId() != 0) {
            System.out.println("Corrispondenza trovata!");
            System.out.println("ID: " + product.getId());
            System.out.println("Nome: " + product.getName());
            System.out.println("Prezzo: " + product.getPrice() + " euro");
        } else {
            System.out.println("Nessun prodotto trovato con il nome: " + type);
        }
    }
    }

