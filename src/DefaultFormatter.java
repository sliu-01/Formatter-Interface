
public class DefaultFormatter implements NumberFormatter
{
	public String format(int a) 
	{
		String b = "" + a;
		if (b.length() < 4)
		{
			return b;
		}
		for (int i = b.length()-3; i > 0; i = i - 3)
		{
			b = b.substring(0, i) + "," + b.substring(i);
		}
		return b;
	}
	
}