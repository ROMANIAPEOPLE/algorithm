package StringAndArray;

public class LicenseKeyFormatting {

	public static void main(String[] args) {
		String s = "8-5g-3-J";
		int k =4;
		
		s=s.replace("-", "");

		int key = s.length()-k;
		
		s=s.toUpperCase();
		StringBuilder builder = new StringBuilder(s);

		builder.insert(key, "-");
		
		System.out.println(builder.toString());
		
		
		
		

		
		
	}
	
}
