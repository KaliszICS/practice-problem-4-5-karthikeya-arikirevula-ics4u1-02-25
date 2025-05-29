import java.util.Objects; 

public class Student {

    private String name;
    private int age;
    private String studentNumber;

    /**
     * construct a new Student object
     *
     * @param name the name of the student
     * @param age the age of the student
     * @param studentNumber the unique student number
     */
    public Student(String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    // getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    // overridden methods

    /**
     * returns a string representation of the Student in the format "name, age - student number"
     */
    @Override
    public String toString() {
        return name + ", " + age + " - " + studentNumber;
    }

    /**

     * @param o the object to compare with
     * @return true if the objects are equal based on student number, false otherwise
     */
    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return Objects.equals(studentNumber, student.studentNumber);
    }

 
    @Override
    public int hashCode() {
        return Objects.hash(studentNumber);
    }

}