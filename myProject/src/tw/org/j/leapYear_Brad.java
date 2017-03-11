package tw.org.j;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JButton;

public class leapYear_Brad {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = 
				JOptionPane.showInputDialog("輸入年分");
		
		int year = Integer.parseInt(input);
		
		if (year % 4 ==0 ){
			
			
			if(year % 100 == 0){
				System.out.println("This is not leap year");

				if(year % 400 == 0){
					System.out.println("This is leap year");
				}//29
			}//28
			else  {
				System.out.println("This is leap year");
			}//29
		}
		else {
			System.out.println("This is not leap year");
		}//28

	}

}
