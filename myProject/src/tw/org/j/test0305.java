package tw.org.j;

public class test0305 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//==============================================================
		// XXX	TEST
		// FIXME HAVE BUG
//==============================================================
//		char var1 = 'a';  //ASCII: 97
//		char var2 = 100;  //ASCII: d
//		int a = 10, b = 3;
//		System.out.println(a % b);        //取餘數
//		System.out.println(var1 + var2);  //數學運算
//		
//		//boolean
//		boolean var3 = true;    // not boolean var3 = 0;
//		boolean var4 = false;
//==============================================================
		double score = Math.random();
		int intScore = (int)(score*101);  //產生 0 ~ 101 間的整數
//		int intScore = (int)(score*6+1);  //產生 1 ~ 6        間的整數
		System.out.println(intScore);
		
		if (intScore>=60){
			System.out.println("Pass");
		}else{
			System.out.println("Down");
		}
		
		
	}

}
