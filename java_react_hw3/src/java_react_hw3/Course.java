package java_react_hw3;

public class Course {
	
	private int id;
	private String courseName;
	private double fiyat;
	private int capacity;
	
	public Course() {
	}

	public Course(int id, String courseName, double fiyat, int capacity) {
		this.id = id;
		this.courseName = courseName;
		this.fiyat = fiyat;
		this.capacity = capacity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
	
			

}
