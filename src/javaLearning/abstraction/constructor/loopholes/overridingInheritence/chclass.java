package javaLearning.abstraction.constructor.loopholes.overridingInheritence;

public class chclass  extends absclass{
	
	chclass(int a)
	{
		super(a);
	}
	
	public static void main(String[] args)
	{
		chclass ch= new chclass(10);
	}
	
	
}
