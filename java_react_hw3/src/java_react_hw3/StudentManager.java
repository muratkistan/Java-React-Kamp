package java_react_hw3;

public class StudentManager  extends UserManager{
	
	public Course kursSatinAl(Student student,Course course) {
		student.setCourse(course);
		System.out.println(course.getCourseName() +" adli kurs basari ile satin alindi\n");
		return course;
		
	}
	
	public void kursIadeEt(Student student ,Course course) {
		System.out.println(course.getCourseName() +" adli kurs iade edildi");
		System.out.println("Geri odeme islemi 2 is gunu icinde gerceklesecek\n");
	}

}
