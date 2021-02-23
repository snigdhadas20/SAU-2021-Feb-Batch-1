package slides;
import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		
		
		Scanner sn = new Scanner(System.in);
		
    	System.out.println("Enter the number ");
    	
        int n= sn.nextInt();
        
        for(int k=0;k<n;k++) {
        	
	        Stack<Integer> a  = new Stack<Integer>();
	        Stack<Double> b = new Stack<Double>();
	        Stack<Integer> c  = new Stack<Integer>();
	        Stack<Double> d = new Stack<Double>();
	        
	        System.out.println("\nEnter string\n");
	        String str = sn.next();
	        str = "0" + str;
	        str = str.replaceAll("-","+-");
	        String temp = "";
	        for (int j = 0;j < str.length();j++)
	        {
	            char ch = str.charAt(j);
	            if (ch == '-')
	                temp = "-" + temp;
	            else if (ch != '+' &&  ch != '*' && ch != '/')
	               temp = temp + ch;
	            else
	            {
	                b.push(Double.parseDouble(temp));
	                a.push((int)ch);
	                temp = "";
	            }
	        }
	        b.push(Double.parseDouble(temp));
	        char operators[] = {'/','*','+'};
	        for (int i = 0; i < 3; i++)
	        {
	            boolean it = false;
	            while (!a.isEmpty())
	            {
	                int optr = a.pop();
	                double v1 = b.pop();
	                double v2 = b.pop();
	                if (optr == operators[i])
	                {
	                    if (i == 0)
	                    {
	                        d.push(v2 / v1);
	                        it = true;
	                        break;
	                    }
	                    else if (i == 1)
	                    {
	                        d.push(v2 * v1);
	                        it = true;
	                        break;
	                    }
	                    else if (i == 2)
	                    {
	                        d.push(v2 + v1);
	                        it = true;
	                        break;
	                    }                                        
	                }
	                else
	                {
	                    d.push(v1);
	                    b.push(v2);
	                    c.push(optr);
	                }                
	            }              
	            while (!d.isEmpty())
	                b.push(d.pop());
	            while (!c.isEmpty())
	                a.push(c.pop());
	            if (it)
	                i--;                            
	        }    
	        System.out.println(b.pop());        
	    }
    }

	}


