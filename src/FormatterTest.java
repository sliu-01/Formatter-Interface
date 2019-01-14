
public class FormatterTest 
{

	public static void main(String[] args) 
	{
		DecimalFormatter test2 = new DecimalFormatter();
		DefaultFormatter test1 = new DefaultFormatter();
		System.out.println(test1.format(100000));
		System.out.println(test1.format(100));
		System.out.println(test2.format(100000));
		System.out.println(test1.format(100));
		
		BaseTwoFormatter test3 = new BaseTwoFormatter();
		System.out.println(test3.format(4));
		System.out.println(test3.format(100));
	}

}
