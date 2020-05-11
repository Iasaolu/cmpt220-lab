package labVII;

public class Course {
	  private String courseName;
	  private String[] students = new String[100];
	  private int numberOfStudents;
	    
	  public Course(String courseName) {
	    this.courseName = courseName;
	  }
	 
	  public void addStudent(String student) {
		  if (numberOfStudents < 100) {
			  students[numberOfStudents] = student;
			  numberOfStudents++;
		  }
	  }
	 
	  public String[] getStudents() {
		  String student[] = new String[numberOfStudents];

		  for(int index = 0; index < numberOfStudents; index++){
			  student[index] = this.students[index];
		  }
		  return students;
	  }

	  public int getNumberOfStudents() {
	    return numberOfStudents;
	  }  

	  public String getCourseName() {
	    return courseName;
	  }  
	 
	  public void dropStudent(String student) {
		  if (numberOfStudents == 0 || numberOfStudents == 1) {
			  students[0] = null;
			  numberOfStudents = 0;
			  return;
			  } else {
			  for (int index = 0; index < numberOfStudents; index++) {
				  if (students[index].equals(student)) {
					  students[index] = students[numberOfStudents - 1];
					  students[numberOfStudents - 1] = null;
					  numberOfStudents--;
				  }
			  }
			 }
	  }
	  public void clear() {
		  for (String studentName:students) {
			  studentName = null;
		  }
		  numberOfStudents = 0;
		  }
}
