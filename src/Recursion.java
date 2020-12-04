
public class Recursion {

	public static void main(String[] args) 
	{
		
		trace(38);	
		
	}
	
	
	public static void trace(int n)
	{
		if(n > 2)
		{
			trace(n%3);
			System.out.print(n/3);
		}	
		else
		{
			//System.out.print(n/3);
		}
		
	}
	
	
	public static int traceTwo(int x)	
    {
   	if(x/5 <= 0)
      	return x%5;
 	  else
     		return traceTwo(x % 5) + traceTwo(x/5);
    }
	
	
	
	public static int traceThree(int a, int b)
	{
	if(b <= 1)
		return a;
	else
		return traceThree(a, b - 1);
	}

}
