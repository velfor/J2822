import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/studentsdb";
    private static final String USER = "root";
    private static final String PASSWORD = "123qwe";

    private static final String SQL_SELECT_STUDENTS = "SELECT * FROM students";

    public static void main(String[] args) {
        try {
            Class.forName(DRIVER);

            Connection connection = null;

            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);

                Statement statement = connection.createStatement();

                ResultSet table = statement.executeQuery(SQL_SELECT_STUDENTS);

                List<Student> list = new ArrayList<>();

                while(table.next()) {
                    Student student = new Student();
                    student.setName(table.getString(2));    // name
                    student.setAge(table.getInt(3));        // age
                    student.setMark(table.getDouble(4));    // mark
                    list.add(student);
                }

                for (Student student: list) {
                    System.out.println(student);
                }

                double avg = Manager.calcAvgMark(list);

                System.out.println("Student's average mark is " + avg);

            } catch (SQLException exception) {
                System.out.println(exception);
            } finally {
                if (connection != null) {
                    try {
                        connection.close();
                    }catch(SQLException exception){
                        System.out.println(exception);
                    }
                }
            }


        } catch (ClassNotFoundException exception) {
            System.out.println(exception);
        }
    }
}
