package tw.org.j;

public class test0312 {

	public static void main(String[] args) {
		
		String s1 = new String();
		byte[] b1 = {1,2,4,5,3};
		String s2 = new String(b1);
		
		String s3 = new String(b1, 2, 2);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		String s4 = new String(b1, 2, 2);


		
	}
	
}
