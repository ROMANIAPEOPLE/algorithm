//package TSET.sort;
//
//import java.util.Arrays;
//
// class Person{
//	
//	String name;
//	String sex;
//	String bloodType;
//
//	
//	public Person(String name, String sex, String bloodType) {
//		this.name = name;
//		this.sex = sex;
//		this.bloodType = bloodType;
//	}
//	public String getName() {
//		return name;
//	}
//	
//	public String getSex() {
//		return sex;
//	}
//	
//	public String getBloodType() {
//
//		return bloodType;
//	}
//	
//	@Override 
//	public String toString() {
//		return String.format("Person{%s, %s, %s}", name, sex, bloodType);
//	}
//	
//	
//	
//}
//
//
//public class CountingSort4 {
//	
//	public static void countingSort(Person [] a) {
//		int ���ڼ� = 0;
//		for(Person p : a) {
//			if(p.getSex().equals("����")) ++���ڼ�;
//		}
//		
//		Person [] r = new Person[a.length];
//		int ����index =0; int ����index = ���ڼ�;
//		
//		for(Person p : a) {
//			if(p.getSex().equals("����")) r[����index++] = p;
//			else r[����index++] = p;
//		}
//		
//		for(int i=0; i<a.length; i++) {
//			a[i] = r[i];
//		}
//		
//		
//		
//		
//		
//	}
//	
//
//	public static void main(String[] args) {
//		 Person[] a = { new Person("ȫ�浿", "����", "O"),       
//				 new Person("����ġ", "����", "A"),            
//				 new Person("������", "����", "AB"),        
//				 new Person("�̸���", "����", "D"),        
//				 new Person("��û", "����", "O"),          
//				 new Person("�Ӳ���", "����", "A"),         
//				 new Person("����", "����", "AB")         
//				 };   
//		 countingSort(a);
//		 System.out.println(Arrays.toString(a)); 
//
//
//	}
//
//}
