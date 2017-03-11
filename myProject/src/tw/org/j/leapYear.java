package tw.org.j;

public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int year = (int)(Math.random()*1000 + 1911);
		int year = 2016;

		System.out.println(year);

		if(year%400==0){
			System.out.println("This is leap year");
		}else if((year%4==0)&&(year!=100)){
			System.out.println("This is leap year");
		}
		else{
			System.out.println("This not leap year");
		}
	}
}
