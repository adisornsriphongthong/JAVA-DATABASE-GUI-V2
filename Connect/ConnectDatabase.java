package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ConnectDatabase {
   public String url = "jdbc:mysql://localhost:3306/zsondatabase";
   public String username = "root";
   public String password = "199500";
   public ResultSet resultSet;

    public ConnectDatabase(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);

            System.out.println("Connected");
            java.sql.Statement statement = connection.createStatement();

            String sqlQuery = "SELECT * FROM student";

            this.resultSet = statement.executeQuery(sqlQuery);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public ResultSet getResultSet(){
        return resultSet;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}