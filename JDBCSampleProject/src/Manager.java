import java.util.List;

public class Manager {
    public static double calcAvgMark(List<Student> list) {
        double avg = 0;
        for (Student student : list) {
            avg += student.getMark();
        }

        return avg / list.size();
    }
}
