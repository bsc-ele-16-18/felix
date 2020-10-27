public class Student{
	private String name;
	private double[] grades;
	private static int totalNumberOfStudents;

	      //constructor creation
	public Student(String name, double[] grades){
		this.name=name;
		this.grades=grades;
	}
	      // these are getteres and setters

	public void setName(String name){

		this.name=name;
	}
	public void setTotalNumberOfStudents(int totalNumberOfStudents){
        totalNumberOfStudents = totalNumberOfStudents++;
    }
	public String getName(){
		return name;
	}
	public void setGrades(double[] grades){
		this.grades=grades;
	}
	public double [] getGrades(){
		return grades;
	}
	public int getTotalNumberOfStudents(){
        return Student.totalNumberOfStudents++;
    }
	    
	    // computing the average grades of students
	public double getAverageGrades(){
		double sum=0;
		double average=0;
	for(int f=0; f < grades.length;f++){
		sum = sum + grades[f];
		average = sum/grades.length;
	}
	return average;
	}
	public void getPrintStudentsDetails(){
		System.out.println("The name of student is "+ this.name);
		 System.out.println("The average is " + getAverageGrades());
		 System.out.println ("Current number of students is " + Student.totalNumberOfStudents);
		
		//return getPrintStudentsDetails;
	} 

}