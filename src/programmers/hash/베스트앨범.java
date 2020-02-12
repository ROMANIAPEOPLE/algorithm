//package programmers.hash;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class º£½ºÆ®¾Ù¹ü {
//	public int[] solution(String[] genres, int[] plays) {
//
//		Map<String, Integer> map = new HashMap<>();
//
//		for (int i = 0; i < plays.length; i++) {
//			Integer count = map.get(genres[i]);
//			if (count == null) {
//				map.put(genres[i], plays[i]);
//			} else {
//				map.put(genres[i], (map.get(genres[i]) + plays[i]));
//			}
//		}
//
//	}
//}
