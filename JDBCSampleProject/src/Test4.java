import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test4 {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/studentsdb";
    private static final String USER = "root";
    private static final String PASSWORD = "123qwe";

    private static final String SQL_INSERT_STUDENT = "INSERT INTO students VALUES(default, ?, ?, ?, ?)";

    public static void main(String[] args) {
        try {
            Class.forName(DRIVER);

            Connection connection = null;

            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);

                PreparedStatement statement = connection.prepareStatement(SQL_INSERT_STUDENT);

                Scanner scanner = new Scanner(System.in);

                System.out.print("Input student name:");
                String name = scanner.nextLine();

                System.out.print("Input student age:");
                int age = scanner.nextInt();

                System.out.print("Input student mark:");
                double mark = scanner.nextDouble();

                System.out.print("Input group id:");
                int id = scanner.nextInt();

                statement.setString(1, name);
                statement.setInt(2, age);
                statement.setDouble(3, mark);
                statement.setInt(4, id);

                statement.executeUpdate();

            } catch (SQLException exception) {
                System.out.println(exception);
            } finally {
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException exception) {
                        System.out.println(exception);
                    }
                }
            }


        } catch (ClassNotFoundException exception) {
            System.out.println(exception);
        }
    }
}
