package entities;

public class Course {

	private String name;
	private int qt;

	public Course(String name, int qt) {
		this.name = name;
		this.qt = qt;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQt() {
		return qt;
	}

	public void setQt(int qt) {
		this.qt = qt;
	}
	
	
}