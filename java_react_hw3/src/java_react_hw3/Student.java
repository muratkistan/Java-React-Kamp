package java_react_hw3;

public class Student extends User {
	
	private Course course;
	
	

	public Student() {
		super();
	}



	public Student(int id, String firstName, String lastName, String email, String password) {
		super(id, firstName, lastName, email, password);
	}



	public Course getCourse() {
		return course;
	}



	public void setCourse(Course course) {
		this.course = course;
	}
	
	

}
