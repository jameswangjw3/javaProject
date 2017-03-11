package tw.org.j;

public class java0311 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = (int)(Math.random()*10+1);
			System.out.println(k);
			System.out.println();

		for(int i=1,j=10; i<10; i++,j--){
			System.out.println(i + ":" + j);
			if(j==k){
				break;
			}
		}
		System.out.println("----------------------------");
//----------------------------------------------------------------
		for(int i=0; i<10; i++){
			if(i%2==0) continue;
			System.out.println(i);
		}
		System.out.println("----------------------------");
//----------------------------------------------------------------	
		John:
		for(int i=0; i<10; i++){
			for (int j=9; j>0; j--){
				System.out.println(i + ":" + j);
				if(j%5==0) break; //John;
			}
		}
		
	}

}
