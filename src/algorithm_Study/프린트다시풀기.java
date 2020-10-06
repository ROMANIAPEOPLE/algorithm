//package algorithm_Study;
//
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.Queue;
//
//class printer{
//
//    int documentNumber;
//    int pri;
//
//    public printer(int documentNumber, int pri){
//        this.documentNumber= documentNumber;
//        this.pri=pri;
//    }
//}
//
//
//public class 프린트다시풀기 {
//    public int solution(int[] priorities, int location) {
//
//        Queue<printer> queue = new LinkedList<>();
//        //1. 큐에 문서번호와 중요도를 포함한 객체를 넣어준다.
//        for(int i=0; i<priorities.length; i++){
//            queue.add(new printer(i,priorities[i]));
//        }
//
//
//        boolean ck=false;
//        int result =1;
//
//        while(!queue.isEmpty()) {
//            printer nowDocument = queue.poll(); //검사를 위해 맨 앞의 문서를 추출함.
//            Iterator it = queue.iterator(); // 맨 앞의 문서를 제외한 나머지 문서들과 우선순위를 비교해야함.
//
//            while(it.hasNext()) {
//                printer value = (printer) it.next();
//
//                if(nowDocument.pri < value.pri) {
//                    queue.add(nowDocument);
//                    ck = true;
//                    break;
//                }
//            }
//
//
//            if(ck) {
//                if(nowDocument.documentNumber == location) {
//                    break;
//                }else {
//                    result++;
//                }
//            }
//
//
//        }
//        return result;
//    }
//}
