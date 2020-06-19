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

//		1. ����ϳ��� �̾Ƽ�,  charToArray�� ����, ������ ���ش�.
//		2. ���ĵȰ��� map�� �����鼭, �̹� ���ĵȰ��� �ִٸ� map�� value�� list�� �������� �� str�� �־��ش�.
//		3. ���ٸ� put

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
