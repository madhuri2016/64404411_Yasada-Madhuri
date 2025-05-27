import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCMySQLExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school";  
        String user = "root";    
        String password = "your_password";  

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            Connection conn = DriverManager.getConnection(url, user, password);

            
            Statement stmt = conn.createStatement();

            
            String sql = "SELECT id, name, age FROM students";
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Students:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println(id + ": " + name + " (" + age + ")");
            }

           
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}