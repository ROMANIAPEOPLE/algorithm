//package ��α׹�������;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class ��󸮽��� {
//
//	public static void main(String[] args) {
//		String jew = "aA";
//		String st = "aAAbbbb";
//
//		System.out.println(solve(jew,st));
//
//	}
//	public static int solve(String jew, String st) {
//		Set<Character> set = new HashSet<>();
//
//		int count =0;
//		for(char j : jew.toCharArray()) {
//			set.add(j);
//		}
//
//		for(char s : st.toCharArray()) {
//			if(set.contains(s)) {
//				count++;
//			}
//
//		}
//
//		return count;
//	}
//
//
//}
