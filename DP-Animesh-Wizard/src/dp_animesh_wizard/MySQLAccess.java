package dp_animesh_wizard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class MySQLAccess {
  private Connection connect = null;
  private Statement statement = null;
  private PreparedStatement preparedStatement = null;
  private ResultSet resultSet = null;

  @SuppressWarnings("deprecation")
public void readDataBase(String query) throws Exception {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      connect = DriverManager.getConnection("jdbc:mysql://localhost/dpAssign?"+ "user=root&password=animesh");

      preparedStatement = connect.prepareStatement(query);
      preparedStatement.executeUpdate();
    } catch (Exception e) {
      throw e;
    } finally {
      close();
    }
}

  private void close() {
    try {
      if (resultSet != null) {
        resultSet.close();
      }

      if (statement != null) {
        statement.close();
      }

      if (connect != null) {
        connect.close();
      }
    } catch (Exception e) {}
  }
}