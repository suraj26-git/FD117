package GitDemo;

public class GitHome {
	
	public void sum(int a,int b)
	{
		int c =a+b;
		System.out.println("sum..GitHome"+c);
	}
	
	
	public void sub(int a,int b)
	{
		int c=a-b;
		System.out.println("sub..GitHome");
	}
	
	public void multi(int a,int b)
	{
		int c=a*b;
		System.out.println("multi..GitHome");
	}
	
	public void divi(int a,int b)
	{
		int c=a/b;
		System.out.println("divi..GitHome");
	}
	
	public void avg()
	{
		System.out.println("avg..GitHome");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Simple Git Demo project");
		
		GitHome rt= new GitHome();
		rt.sum(10,20);
		rt.sub(80, 20);
		rt.multi(3, 5);
		rt.divi(30, 5);
		
	}

}
