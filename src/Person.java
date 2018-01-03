
public class Person {
	private String name;
	private String PhoneNum;
	private int age;
	private int gender;
	private Dog dog = null;
	private boolean hasDog = false;
	
	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
		hasDog = true;
	}

	public boolean hasDog() {
		return hasDog;
	}

	public static int MALE = 1;
	public static int FEMALE = 2;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return PhoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		PhoneNum = phoneNum;
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
	
	public Person(String name, String PhoneNum, int gender, int age) {
		this.name = name;
		this.PhoneNum = PhoneNum;
		this.gender = gender;
		this.age = age;
	}
	
}
