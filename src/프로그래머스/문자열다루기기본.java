package ���α׷��ӽ�;

import java.util.*;

public class ���ڿ��ٷ��⺻ {

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
