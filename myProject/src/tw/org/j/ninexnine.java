package tw.org.j;

public class ninexnine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//--------------------------------------------------------------------------------------------------
//		int i;
//		int j;
//		for(i=1; i<=9; i++){
//			for(j=2; j<=5; j++){
//				System.out.print(j + " * " + i + " = " + j*i + "\t" );
//			}
//			System.out.println();
//		}
//		System.out.println("===========================================================");
//		int k;
//		int l;
//		for(k=1; k<=9; k++){
//			for(l=6; l<=9; l++){
//				System.out.print(l + " * " + k + " = " + l*k + "\t" );
//			}
//			System.out.println();
//		}
//-------------------------------------------------------------------------------------------------		
		int result;
		for(int k=0; k<2; k++){
			for(int j=1; j<=9; j++){
				for(int i=2; i<=5; i++){
					int newi = i + k * 4;
					result = newi * j;
					System.out.print(newi + " x " + j + " = " + result + "\t");
				}
				System.out.println();
			}
			System.out.println("--------------------------------------------------------------");
		}
	}
}