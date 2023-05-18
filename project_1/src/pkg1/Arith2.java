package pkg1;

public class Arith2 {
	public int multi (int a, int b)
	{
		int c = a*b;
		System.out.println("multi is: "+c);
		return c;
	}
	
	public int sum (int a1, int b1)
	{
		int c1 = a1+b1;
		System.out.println("sum is: "+c1);
		return c1;
	}
	public int sub (int a2, int b2)
	{
		int c2 = a2-b2;
		System.out.println("sub is: "+c2);
		return c2;
	}
	public void div (int a3, int b3)
	{
		int c3 = a3/b3;
		System.out.println("final div result is: "+c3);
		
	}
	
	public static void main(String[] args) {
		
		Arith2 obj = new Arith2();
		System.out.println("Problem- (((((10*2)+2)-2)-2)/2)");
		int multiresult = obj.multi(10,2);
		int sumresult = obj. sum(multiresult, 2);
		int subresult = obj.sub(sumresult,  2);
		int subresult2 = obj.sub(subresult,2);
		obj.div(subresult2,2);
		
	}
}

