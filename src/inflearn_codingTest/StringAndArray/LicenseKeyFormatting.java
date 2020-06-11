package inflearn_codingTest.StringAndArray;

public class LicenseKeyFormatting {

	public static void main(String[] args) {
		String s = "5F3Z-2e-9-w";
		int k =4;
		
		s=s.replace("-", "");

		int key = s.length()-k;
		
		s=s.toUpperCase();
		StringBuilder builder = new StringBuilder(s);

		builder.insert(key, "-");
		
		System.out.println(builder.toString());
		
		
		
		

		
		
	}
	
}
