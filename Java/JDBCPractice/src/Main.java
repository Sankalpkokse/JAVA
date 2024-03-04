import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println("Hello world!");
        String sql = "Select name from TableName where id = 2";
        String url = "jdbc:postgresql://localhost:5432/TableName";
        String username = "postgres";
        String password = "0000";

        Connection con = DriverManager.getConnection(url,username,password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        String name = rs.getString(1);
        System.out.println(name);
    }
}