package tw.org.j;

public class score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double score = Math.random();
//		int intScore = (int)(score*101);
		
		int intScore = (int)(Math.random() * 100 + 1);
		
//		int intScore = (int)(Math.random() * 101);
		System.out.println(intScore);
		
		if(intScore>=90){
//			System.out.println(intScore);
			System.out.println("A");
		}else if(intScore>=80){
//			System.out.println(intScore);
			System.out.println("B");
	    }else if(intScore>=70){
//			System.out.println(intScore);
			System.out.println("C");
        }else if(intScore>=60){
//			System.out.println(intScore);
			System.out.println("D");
		}else{ 
//			System.out.println(intScore);
			System.out.println("E");
		}
	}
}

