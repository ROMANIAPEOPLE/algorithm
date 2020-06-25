package 블로그문제복습;

//input : 8F3Z-2e-9-w
//output : 8F3Z-2E9W

//input : 8-5g-3-J
//output : 8-5G3J



public class 라이센스키포멧팅 {
	
	public static void main(String [] args) {
		String str = "8-5g-3-J	";
		int k = 4;
		
		
	
		str = str.replace("-", "");
		str= str.toUpperCase();
		
		int key = str.length()-k;
		
	

		StringBuilder sb = new StringBuilder(str);
sb.insert(key, "-");
		System.out.println(sb.toString());	
	}
}
