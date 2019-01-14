
public class BaseTwoFormatter implements NumberFormatter
{
	public String format(int a) 
	{
		if (a == 0)
		{
			 return "";
		}
		String b = "" + format(a/2) + a%2;
		return b;
	}
}
