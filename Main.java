class Student {
    private final String name;
    private final int age;
    private final double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("------------------------------");
    } 

    public double GetGrade(){
        return grade;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Jake", 23, 100);
        Student s2 = new Student("Brix", 20, 90);
        Student s3 = new Student("ArJay and AJhay", 30, 98);

        Student[] students = {s1, s2, s3};

        for (Student student : students) {
            student.displayInfo();
        }

        //calculate average grade
        double total = 0;

        for (Student student : students) {
            total += student.GetGrade();
        }

        System.out.println("Average Grade: " + total / students.length);
    }
}