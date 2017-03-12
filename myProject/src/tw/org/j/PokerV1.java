package tw.org.j;

public class PokerV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		int[] poker = new int[52]; // 0-51 => 0
		for(int i=0; i<52; i++){
			int temp = (int)(Math.random()*52);
			
			//檢查機制是否重複
			boolean isRepeat = false;
			for(int j=0; j<i; j++){
				if(poker[j]==temp){
					isRepeat = true;
					break;
				}
			}
			
			if (!isRepeat){
				poker[i] = temp;
				System.out.println(poker[i]);
			}else{
				i--;
				
			}

		}
		System.out.println("--------------------------------------------");
		System.out.println(poker.length);
		System.out.println("耗時 : " + (System.currentTimeMillis() - start) + "ms");
	}


}
