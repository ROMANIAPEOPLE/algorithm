package algorithm_Study;




import java.util.Arrays;

class Solution1 {
    public int[] solution(int[] prices) {
        int[] answer =  new int[prices.length];

        int count = 0;
        for(int i=0; i<prices.length-1; i++){
            for(int j=i+1; j<prices.length; j++) {
                if(prices[i] <= prices[j]) {
                    count++;
                }else {
                    count++;
                    break;
                }
            }
            answer[i] = count;
            count=0;
        }

        answer[answer.length-1] = 0;

        return answer;
    }
}

public class TEST2 extends TEST {


    //todo : https://programmers.co.kr/learn/courses/30/lessons/42584
    public static void main(String[] args) {

        int [] prices = {1,2,3,2,3};
        Solution1 s  = new Solution1();
        System.out.println(Arrays.toString(s.solution(prices)));






    }
}
