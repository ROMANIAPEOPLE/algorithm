//package TSET.sort;
//
//import java.util.Arrays;
//
//public class ����partition {
//	
//	
//	static void swap(int [] a, int i, int j) {
//	
//		int temp = a[i];
//		a[i] = a[j];
//		a[j] = temp;
//	}
//	
//	static void partition(int [] a) {
//		
//		
//		int i = -1;
//		for(int j=0; j<a.length; j++) {
//			if(a[j].getSex().equals("����")) {
//				swap(a,++i,j);
//			}
//		}
//
//		
//		
//	}
//
//	public static void main(String[] args) {
//
//		 Person[] a = { new Person("ȫ�浿", "����", "O"),       
//				 new Person("����ġ", "����", "A"),            
//				 new Person("������", "����", "AB"),        
//				 new Person("�̸���", "����", "D"),        
//				 new Person("��û", "����", "O"),          
//				 new Person("�Ӳ���", "����", "A"),         
//				 new Person("����", "����", "AB")         
//				 };   
//		 partition(a);
//		 System.out.println(Arrays.toString(a)); 
//
//		
//	}
//
//}
