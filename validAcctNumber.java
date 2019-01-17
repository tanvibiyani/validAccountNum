//Name: Tanvi Biyani

package validAccountNumber;

import java.util.*;

public class validAcctNumber {
	

	public static void main(String[] args) {
		
		boolean number = checkValidAccNum(4581002);
		System.out.println(number);
	
	}
	
	public static boolean checkValidAccNum(int num) {
		
		 int[] validAccNum ={ 5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 8080152,456255, 5552012, 5050552, 7825877, 1250255, 1005231, 6545231, 3852085, 7576651, 7881200, 4581002};
		 
		 for(int i = 0; i < validAccNum.length; i++) {
			 
			 if(validAccNum[i] == num)
				 return true;
		
		 }
		 
		return false;
	}
	

}
