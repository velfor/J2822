package Lesson19;
/*
Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от
студента наличием некой научной работы.
Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark,
содержащую среднюю оценку.
Создать переменную типа Student, которая ссылается на объект типа Aspirant.
Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
Если средняя оценка студента равна 5, то сумма 100 грн, иначе 80. Переопределить этот метод в
классе Aspirant.  Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
Создать массив типа Student, содержащий объекты класса Student и Aspirant.
 */
public class Student {
    protected String firstName;
    protected String lastName;
    protected int group;
    protected double averageMark;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
    Student(){}
    public Student(String firstName, String lastName, int group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group=" + group +
                ", averageMark=" + averageMark +
                '}';
    }

    public int getScholarship(){
        int grant;
        if (Math.abs(averageMark - 5.0) < 1E-5){
            grant = 100;
        }
        else{
            grant = 80;
        }
        return grant;
    }
}
