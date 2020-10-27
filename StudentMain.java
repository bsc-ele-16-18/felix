import  java.util.Scanner;
public class StudentMain{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        double grades [] = new double[5];
        System.out.print("enter the name: ");
        String name =  input.nextLine();
    
    System.out.println("Enter Five Grades: ");
    for(int f=0; f < grades.length;f++){
        grades[f] = input.nextDouble();
    }

    // call the student class

    Student Felie = new Student(name, grades);
    Felie.getTotalNumberOfStudents();
    Felie.getPrintStudentsDetails();

    
    
        

    }
}