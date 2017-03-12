package tw.org.j;

public class PokerV3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long start = System.currentTimeMillis();
		boolean[] check = new boolean[52];  //oranginal array [false]  
		int[] poker = new int[52];          //
		int temp;
		for(int i=0; i<52; i++){
				//重複
				boolean isRepeat = false;
				do{
					temp = (int)(Math.random()*52);  //temp is a random No.
				}while(check[temp]);
				
				//get a number and put it to another array, then set it true.
				poker[i] = temp;
				check[temp] = true;
				System.out.println(temp);
		}
		
		System.out.println("--------------------------------------------");
		System.out.println(poker.length);
		System.out.println("耗時 : " + (System.currentTimeMillis() - start) + "ms");

	}
}
