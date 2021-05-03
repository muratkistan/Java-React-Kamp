package java_react_hw3;

public class InstructorManager  extends UserManager{
	
	public Course kursAc(Instructor  instructor,Course course) {
		instructor.setCourse(course);
		System.out.println(course.getCourseName() +" adli kurs olusturuldu \n");
		return course;
	}
	
}
