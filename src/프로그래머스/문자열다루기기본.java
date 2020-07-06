package 프로그래머스;

import java.util.*;

public class 문자열다루기기본 {

	public static void main(String[] args) {
		String s = "a234";
		System.out.println(solution(s));
	}

	public static boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
        return false;
  }
}

//class Solution {
//	  public boolean solution(String s) {
//	      boolean answer = true;
//	          
//	          char[] temp = s.toCharArray();
//	          if(temp.length!=4 && temp.length!=6){
//	              return false;
//	          }
//	          for(int i =0; i<temp.length; i++) {
//	              if(!(temp[i] >='0' && temp[i] <='9')) {
//	                  answer = false;
//	                  return answer;
//	              }
//	          }
//	          return answer;
//	  }
//	}
