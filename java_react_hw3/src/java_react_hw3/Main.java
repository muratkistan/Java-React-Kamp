package java_react_hw3;

public class Main {

	public static void main(String[] args) {
		
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		Course course1 = new Course(1,"Java-React",0,100);
		Course course2 = new Course(2,"C#-Angular",0,150);
		
		Instructor instructor1 = new Instructor(1,"Engin","Demirog","engin@gmail.com","1234");
		Instructor instructor2 = new Instructor(2,"Kerem","Varis","kerem@gmail.com","12345");
		
		Student student1 = new Student(1,"Murat Ali","Kistan","murat@gmail.com","1234");
		Student student2 = new Student(2,"Kenan","Karaman","kenan@gmail.com","12345");
		
		Instructor[] instructors = {instructor1,instructor2};
		Student[] students = {student1,student2};
		
		
		
		studentManager.kullaniciEkle(students);
		studentManager.kursSatinAl(student1, course1);
		studentManager.kursSatinAl(student2, course2);
		
		instructorManager.kullaniciEkle(instructors);
		instructorManager.kursAc(instructor1, course2);
		instructorManager.kullaniciSil(instructor2);

	}

}
