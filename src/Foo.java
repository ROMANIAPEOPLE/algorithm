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
		Person p = new Person("ȫ�ؼ�");
		
		newPerson(p);
		System.out.println(p);
		
		setNewName(p);
		System.out.println(p);
	}

	static void newPerson(Person p) {
		p= new Person("ȫ����");				
	}
	
	static void setNewName(Person p) {
		p.setName("ȫ����");
	}
	
	

}
