
public class Main {
	public static void main(String[]args) {
		Person p = new Person("Josh", "952-205-7979", Person.MALE, 32);
		Dog d = new Dog("DOGEEE", Dog.FEMALE, 3);
		p.setDog(d);
		System.out.println(p.getDog().getAge());
	}
}
