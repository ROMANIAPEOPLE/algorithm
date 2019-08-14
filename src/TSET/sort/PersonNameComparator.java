package TSET.sort;

import java.util.Comparator;
//������ ������ 2�� �̻��� �� ����ϴ� comparator
public class PersonNameComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		int r = p1.name.compareTo(p2.name); //�̸� �񱳰��, p1�� ũ�ٸ� ����� p2�� ũ�ٸ� ������, ũ�Ⱑ ���ٸ� 0
		if(r !=0) return r; // �̸��� �������� �ʴٸ� �񱳰���� r�� �״�� ����
		return p1.age-p2.age;  //�̸��� �����ϴٸ� , ���� �� ����� ����
		
	

	}

}
