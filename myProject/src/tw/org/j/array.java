package tw.org.j;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		boolean[] a;
//		a = new boolean[3];
//		System.out.println(a.length);
//		for (int i=0; i<a.length; i++){
//			System.out.println(a[i]);
//		}
//----------------------------------------------------------------
		
		int[] p = new int[6];
		for (int i=0; i<100000;i++){
			int dice = (int)(Math.random()*9);
			p[(dice>=6)?dice-3:dice]++;
		}
		for (int i=0; i<p.length; i++){
			System.out.println( (i+1) + "點出現" + p[i] + "次" );
		}
	}

}
