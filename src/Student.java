
public class Student {
	public String name;
    public double gpa;

    public void setName(String studentName) {
        this.name = studentName;
    }
    public void setGpa(double studentGpa) {
        this.gpa = studentGpa;
    }
    public String getName() {
        return this.name;
    }
    public double getGpa() {
        return this.gpa;
    }
    public void displayInfo() {
        System.out.println("Student Name: " + this.name);
        System.out.println("GPA: " + this.gpa);
    }
}
