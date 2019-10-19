
import java.util.*;
import java.io.*;

class Solution {
	public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
   
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                
                
                if(x>=java.lang.Short.MIN_VALUE && x<=java.lang.Short.MAX_VALUE)System.out.println("* short");
                
                if(x>=java.lang.Integer.MIN_VALUE && x<=java.lang.Integer.MAX_VALUE)System.out.println("* int");
                
                if(x>=java.lang.Long.MIN_VALUE && x<=java.lang.Long.MAX_VALUE)System.out.println("* long");
                /*
        		 * 
        		 * java.lang.Short.MAX_VALUE; java.lang.Short.MIN_VALUE;
        		 * 
        		 * java.lang.Integer.MAX_VALUE; java.lang.Integer.MIN_VALUE;
        		 * 
        		 * java.lang.Long.MAX_VALUE; java.lang.Long.MIN_VALUE;
        		 */
        		  
                
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
