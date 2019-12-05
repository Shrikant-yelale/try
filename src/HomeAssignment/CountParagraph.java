package HomeAssignment;

public class CountParagraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "1) The stories have been translated into nearly every language in the world that has a script. 2) The story form appeals to children while the wisdom in them attracts adults. 3) The Panchatantra collection represents the earliest folk tale form in the world of literature. 4) - There are several versions of Panchatantra tales in circulation in the world but the one that is popular in India is the Sanskrit original of Vishnu Sharman.";
		int number=0,vowels=0,con=0,oth=0;
		char t;
		for(int i=0;i<s.length();i++)
		{
			t=s.charAt(i);
			if(t<'9' && t>'0')
			{
				number++;
			}
			else if (t=='a' || t=='e'||t=='i'||t=='o'||t=='u'||t=='A'||t=='E'||t=='I'||t=='O'||t=='U')
			{
				vowels++;
			}
			else if(t>'a' && t<='z')
			{
				con++;
			}
			else if(t>'A' && t<='Z')
			{
				con++;
			}
		}
		
		oth=s.length()-(number+vowels+con);
		System.out.println("Total length = " +s.length());
		System.out.println("No. of numeric digit = "+ number);
		System.out.println("No. of vowels = "+ vowels);
		System.out.println("No. of consonents = "+ con);
		System.out.println("No. of Other characters = "+ oth);
	}
	
	

}
