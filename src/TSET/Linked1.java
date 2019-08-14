package TSET;

import java.util.Scanner;

class Linked2 {
	private class Node {
		int data;
		Node link;

		Node(int data) {
			this.data = data;
		}
	}

	private Node head = null;

	public int size() {
		Node temp = head;
		int size = 0;
		while (temp != null) {
			temp = temp.link;
			size++;
		}

		return size;
	}

	public void addFirst(int value) {
		Node t = new Node(value);
		t.link = head;
		head = t;
	}

	public void addLast(int value) {
		Node t = new Node(value);
		Node temp = head;

		if (head == null) {
			head = t;
		} else {
			while (temp.link!= null) {
				temp = temp.link;
			}
			temp.link = t;
			
		}

	}
	
	public int removeFirst() {
		if(head == null) {
			System.out.println("head == null");
			return 0;
		}
		else {
			int data = head.data;
			head = head.link;
			return data;
		}
	}
	
	public int removeLast() {
		Node temp = head;
		
		while(temp.link.link !=null) {
			temp = temp.link;
		}
		int data = temp.link.data;
		temp.link  = null;
		return data;
		
	}

}

public class Linked1 {

	public static void main(String[] args) {

		Linked2 list = new Linked2();
		System.out.println("hw6_1 : 정기혁");

		Scanner sc = new Scanner(System.in);

		int menu = 0;
		do {
			System.out.println(" 1:전체조회 2:길이조회 3:맨앞삽입 4:맨뒤삽입 5:맨앞삭제 6:맨뒤삭제 7:종료");

			menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("1:전체조회");
				System.out.println(list);
				break;
			case 2:
				System.out.println("2:길이조회");
				System.out.println(list.size());
				break;
			case 3:
				System.out.println("3:맨앞에 삽입할 정수 입력");
				int data = sc.nextInt();
				list.addFirst(data);
				break;
			case 4:
				System.out.println("4:맨 뒤에 삽입할 정수 입력");
				data = sc.nextInt();
				list.addLast(data);
				break;
			case 5:
				System.out.println("5:맨 앞 원소를 삭제");
				System.out.println(list.removeFirst());
				break;
			case 6:
				System.out.println("6:맨 뒤 원소를 삭제");
				System.out.println(list.removeLast());
				break;
			case 7:
				System.out.println("종료합니다.");
				break;
			}

		} while (menu != 7);

	}
}
