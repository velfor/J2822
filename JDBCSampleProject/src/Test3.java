import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test3 {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/studentsdb";
    private static final String USER = "root";
    private static final String PASSWORD = "123qwe";

    private static final String SQL_SELECT_STUDENTS = "SELECT * FROM students WHERE mark > ?";
    private static final String SQL_INSERT_STUDENT = "INSERT INTO students VALUES(default, ?, ?, ?, ?)";

    public static void main(String[] args) {
        try {
            Class.forName(DRIVER);

            Connection connection = null;

            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);

                PreparedStatement statement = connection.prepareStatement(SQL_SELECT_STUDENTS);

                Scanner scanner = new Scanner(System.in);
                System.out.print("Input your mark:");
                String mark = scanner.nextLine();

                statement.setString(1, mark);

                ResultSet table = statement.executeQuery();

                List<Student> list = new ArrayList<>();

                while (table.next()) {
                    Student student = new Student();
                    student.setName(table.getString(2));    // name
                    student.setAge(table.getInt(3));        // age
                    student.setMark(table.getDouble(4));    // mark
                    list.add(student);
                }

                for (Student student : list) {
                    System.out.println(student);
                }

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
