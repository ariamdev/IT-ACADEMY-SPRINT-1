package n3exercici1;

public class student {

    private String name;
    private int age;
    private String course;
    private double qualification;

    public student(String name, int age, String course, double qualification) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.qualification = qualification;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getQualification() {
        return this.qualification;
    }

    public void setQualification(double qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Age: " + this.age + " Course: " + this.course + " Qualification: " + this.qualification;
    }
}
