
public class StudentInfo {
    String name;
    int age;
    int marks;
    String course;
    
    StudentInfo(String name, int age, int marks, String course)
    {
        this.name=name;
        this.age=age;
        this.marks=marks;
        this.course=course;
    }

    void displayInfo()
    {   
        System.out.println("---Student Information---");
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Course :"+course);
        System.out.println("Marks :"+marks);
    }

    void calculateGrade()
    {
        if (marks >=90) {
            System.out.println("Grade A+ (Excellent)");
        }
        else if (marks >=80) {
        System.out.println("Grade A (Very Good))");

        }
        else if (marks >= 70) {
            System.out.println("Grade B (Good)");
        }
        else if (marks >= 60) {
            System.out.println("Grade c (Pass)");            
        }
        else
        {
            System.out.println("You Need Work Harder");
        }
    }

    void isEligibleForScholorship()
    {
        if(marks >=60)
        {
            System.out.println("Yes , Eligible for Scholorship");;
        }
        else
        {
            System.out.println("No , Not eligible for scholorship ");
        }
    }
    public static void main(String[] args) {
        StudentInfo stu1=new StudentInfo("Ansh",22,90,"CS");
        StudentInfo stu2=new StudentInfo("Satyam",22,90,"CS");
        StudentInfo stu3=new StudentInfo("Abhay",22,90,"CS");
        

        stu1.displayInfo();
        stu1.calculateGrade();
        stu1.isEligibleForScholorship();

    }

}
