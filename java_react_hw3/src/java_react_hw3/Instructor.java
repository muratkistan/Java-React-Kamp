package java_react_hw3;

public class Instructor extends User {
	
	private Course course;
	

	public Instructor() {
	}


	public Instructor(int id, String firstName, String lastName, String email, String password) {
		super(id, firstName, lastName, email, password);
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}
	
	
	
	

}
