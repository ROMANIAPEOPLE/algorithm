//package ��α׹�������;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class �þƳ��׷��Ŀ�� {
//	public static void main(String[] args) {
//		String s ="cbaebabacd";
//		String p = "abc";
//
//		ArrayList<Integer> list = new ArrayList<>();
//
//		list = (ArrayList<Integer>) solve(s,p);
//
//		System.out.println(list.toString());
//	}
//
//	public static List<Integer> solve(String s, String p){
//
//		List<Integer> list = new ArrayList<>();
//		int [] pArr = new int[256];
//		for(int i=0; i<p.length(); i++) {
//			pArr[p.charAt(i)]++;
//		}
//
//		for(int i=0; i<s.length()-p.length()+1; i++) {
//			int [] sArr = new int[256];
//			for(int j=0; j<p.length(); j++) {
//				sArr[s.charAt(i+j)]++;
//			}
//
//			if(check(sArr,pArr)) {
//				list.add(i);
//			}
//
//
//		}
//		return list;
//
//	}
//
//	public static boolean check(int [] sArr, int [] pArr) {
//		for(int i=0; i<sArr.length; i++) {
//			if(sArr[i] != pArr[i]) return false;
//
//		}
//		return true;
//
//	}
//
//}
