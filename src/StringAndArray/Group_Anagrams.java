package StringAndArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_Anagrams {
	public static void main(String[] args) {
		String[] str = { "eat", "tea", "tan", "ate", "nat", "bat" };

		System.out.println(solve(str));
	}

	public static List<List<String>> solve(String[] strs) {

//		1. 요소하나씩 뽑아서,  charToArray로 만들어서, 정렬을 해준다.
//		2. 정렬된것을 map에 넣으면서, 이미 정렬된것이 있다면 map의 value인 list에 정렬전의 값 str을 넣어준다.
//		3. 없다면 put

		ArrayList<List<String>> list = new ArrayList<>();

		Map<String, List<String>> map = new HashMap<>();

		for (String str : strs) {
			char[] charArr = str.toCharArray();

			Arrays.sort(charArr);
			System.out.println(charArr);

			String key = String.valueOf(charArr);

			if (map.containsKey(key)) {
				map.get(key).add(str);
			} else {

				List<String> list2 = new ArrayList<>();
				list2.add(str);
				map.put(key, list2);
			}

		}
		list.addAll(map.values());
		return list;

	}

}
