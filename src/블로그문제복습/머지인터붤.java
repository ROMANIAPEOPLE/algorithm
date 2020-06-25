package 블로그문제복습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


//1 3 / 2 6  8 10  15 18

class MergeInter{
	int start;
	int end;
	
	MergeInter(){
		this.start=0;
		this.end=0;
	}
	
	MergeInter(int start, int end){
		this.start=start;
		this.end=end;
	}
}

public class 머지인터붤 {
	public static void main(String []  args) {
		
		MergeInter m1 = new MergeInter(1,3);
		MergeInter m2 = new MergeInter(2,6);
		MergeInter m3 = new MergeInter(8,10);
		MergeInter m4 = new MergeInter(15,18);

		ArrayList<MergeInter> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		
		ArrayList<MergeInter> res = new ArrayList<>();


		Collections.sort(list, (o1,o2) -> o1.start-o2.start);
		
		MergeInter before = list.get(0);
		for(int i=1; i<list.size(); i++) {
			MergeInter cur = list.get(i);
			if(before.end >= cur.start ) {
				before.end = Math.max(before.end, cur.end);
			}else {
				res.add(before);
				before = cur;
			}
		}
		if(!res.contains(before)) {
			res.add(before);
		}
		
		
		for(MergeInter i : res) {
			System.out.println(i.start + "," + i.end);
		}
		
	}
}
