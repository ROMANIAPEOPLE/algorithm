package 프로그래머스_2;



import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer>  list = new ArrayList<>();

        for(int i=0; i<progresses.length; i++){
            queue.add(((100-progresses[i]) % speeds[i] == 0) ? ((100-progresses[i]) / speeds[i])  : ((100-progresses[i]) / speeds[i])+1  );
        }
        int count =1;
        int firstProgresses = queue.poll();
        while(!queue.isEmpty()) {
            int secondProgresses = queue.poll();
            if(firstProgresses >= secondProgresses) {
                count++;
            }
            else {
                list.add(count);
                firstProgresses= secondProgresses;
                count =1;
            }

        }

        list.add(count);


        int [] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }


        return answer;
    }
}
public class 기능개발 {
    public static void main(String[] args) {
        int [] speeds = {1, 30, 5};
        int[] progresses = {93, 30, 55};

        Solution s2 = new Solution();
        System.out.println(Arrays.toString( s2.solution(progresses,speeds)));
    }
}
