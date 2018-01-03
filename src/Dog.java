
public class Dog {
	private String name;
	private int age;
	private int gender;
	
	public static int MALE = 1;
	public static int FEMALE = 2;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Dog(String name,int gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
}
