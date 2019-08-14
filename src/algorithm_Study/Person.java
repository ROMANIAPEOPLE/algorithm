package algorithm_Study;

public class Person {
	String name;
	String sex;
	String blood;

	public Person(String name, String sex, String bloodType) {
		this.name = name;
		this.sex = sex;
		this.blood = blood;
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public String getBloodType() {
		return blood;
	}

	@Override
	public String toString() {
		return String.format("Person{%s, %s, %s}", name, sex, blood);

	}

}
