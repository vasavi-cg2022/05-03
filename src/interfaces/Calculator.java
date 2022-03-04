package interfaces;

public class Calculator implements ArthematicOperations,GemotricOperations {
 @Override
public void add()
{
	System.out.println(a+b);
}
 @Override
public void mul()
{
	System.out.println(a*b);
}
public void div()
{
	System.out.println(a/b);
}public void mod()
{
	System.out.println(a%b);
}
public void findBiggest()
{
	System.out.println("biggest="+Math.sin(a));
	System.out.println("biggest="+Math.sin(b));
}
public void calculatesin()
{
	System.out.println("biggest="+Math.sin(a));
	System.out.println("biggest="+Math.sin(b));
}
public void formula()
{
	System.out.println("algebra="+Math.pow(a*2, b));
}
}
