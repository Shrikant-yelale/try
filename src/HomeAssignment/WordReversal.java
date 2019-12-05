package HomeAssignment;

public class WordReversal {
	
	public static String reverse(String rev)
	{
		String p="";
		for(int i=rev.length()-1;i>=0;i--)
		{
			p=p+rev.charAt(i);
		}
		return p;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s= {"Twinkle, twinkle little star",
		"Twinkle, twinkle, little star,",
		"How I wonder what you are,",
		"Up above the world so high,",
		"Like a diamond in the sky, twinkle, twinkle, little star,",
		"How I wonder what you are."};
		
		String re="";
		for(int i=0;i<s.length;i++)
		{
			re="";
			for(int j=0;j<s[i].length();j++)
			{
				if(s[i].charAt(j)>='a' && s[i].charAt(j)<='z')
				{
					re=re+s[i].charAt(j);
				}else if(s[i].charAt(j)>='A' && s[i].charAt(j)<='Z')
				{
					re=re+s[i].charAt(j);
				}
				else
				{
					System.out.print(reverse(re)+ s[i].charAt(j));
					re="";
				}
			}
			System.out.println();
		}
				


	}

}
