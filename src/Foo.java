public class Foo {
	static class Person{
		private String name;
		public Person(String name) {
			this.name = name;
		}
	
		public void setName(String name) {
			this.name = name;
		}
		
		@Override
		public String toString() {
			return this.name;
		}
	
	}
	public static void main(String[] args) {
		Person p = new Person("全霖己");
		
		newPerson(p);
		System.out.println(p);
		
		setNewName(p);
		System.out.println(p);
	}

	static void newPerson(Person p) {
		p= new Person("全己林");				
	}
	
	static void setNewName(Person p) {
		p.setName("全己林");
	}
	
	

}
