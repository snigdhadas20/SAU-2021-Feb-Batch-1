package handson;
import java.util.*;

class ExceptPrime extends Exception{

}

public class Question3 {
	public static boolean checkPrime(int number) {
		if(number<=1)
			return false;
		if(number<=3)
			return true;
		if(number%2==0||number%3==0)
			return false;
		for(int i=5;i*i<=number;i=i+6)
			if(number%i==0 || number%(i+2)==0)
				return false;
		return true;
	}

	public static void main(String[] args) {
		int c=1;
		while(c<=100) {
			try {
				if(checkPrime(c))
					throw new ExceptPrime();
			}
			catch(ExceptPrime e) {
				System.out.println(c+" is a Prime Number");
			}
			finally {
				c++;
			}
		}
	}


}