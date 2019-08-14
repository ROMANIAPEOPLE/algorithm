package TSET.sort;

import java.util.Comparator;
//순서의 기준이 2개 이상일 떄 사용하는 comparator
public class PersonNameComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		int r = p1.name.compareTo(p2.name); //이름 비교결과, p1이 크다면 양수를 p2가 크다면 음수를, 크기가 같다면 0
		if(r !=0) return r; // 이름이 동일하지 않다면 비교결과인 r을 그대로 리턴
		return p1.age-p2.age;  //이름이 동일하다면 , 나이 비교 결과를 리턴
		
	

	}

}
