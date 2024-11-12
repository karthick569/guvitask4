package post_java;

public class numberofdigits {

	public static void main(String[] args) 
	{
		 int number = 1000;
		 int count = 0;
		 if (number == 0)
		 {
	       count = 1; 
	     } 
		 else 
	     {
			 number = Math.abs(number);
			 while (number > 0) 
			    {
	                number /= 10; 
	                count++;
	            }
	        }

	        System.out.println("Number of digits: " + count);

	}

}
