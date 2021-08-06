package companies.intrvwQustns.WiproPractice.testngQuestionsAndPractice;

import org.testng.annotations.Test;

public class GroupingTestCases {
	
	@Test(groups="sanity")
	public void a()
	{
		System.out.println("this is sanity test");
		
	}
	@Test(groups="regression")
	public void b()
	{
		System.out.println("this is regression test");
		
	}
	@Test(groups="smoke")
	public void c()
	{
		System.out.println("this is smoke test");
		
	}
	@Test(groups="sanity")
	public void d()
	{
		System.out.println("this is sanity test");
		
	}
	@Test(groups="sanity")
	public void e()
	{
		System.out.println("this is sanity test");
		
	}
	@Test(groups="smoke")
	public void f()
	{
		System.out.println("this is smoke test");
		
	}
	@Test(groups="regression")
	public void g()
	{
		System.out.println("this is regression test");
		
	}
}
