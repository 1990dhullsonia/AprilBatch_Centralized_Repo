package pkg1;

public class Arith {
	public int sum (int a, int b)
	{
		int c = a+b;
		System.out.println("sum is: "+c);
		return c;
	}
	
	public int sub (int a1, int b1)
	{
		int c1 = a1-b1;
		System.out.println("sub is: "+c1);
		return c1;
	}
	public int multi (int a2, int b2)
	{
		int c2 = a2*b2;
		System.out.println("multi is: "+c2);
		return c2;
	}
	public void div (int a3, int b3)
	{
		int c3 = a3/b3;
		System.out.println("final div result is: "+c3);
		
	}
	
	public static void main(String[] args) {
		
		Arith obj = new Arith();
		System.out.println("Problem- (((((10+2)+2)-2)*2)/2)");
		int sumresult = obj.sum(10,2);
		int sumresult1 = obj. sum(sumresult, 2);
		int subresult = obj.sub(sumresult1,  2);
		int multiresult = obj.multi(subresult,2);
		obj.div(multiresult,2);
		
	}
}
