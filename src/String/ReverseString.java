package String;

public class ReverseString {

	public static void main(String[] args) {
		String s="poonam";
		char a[]=s.toCharArray();
		int len=0;
		for(char b:a)
		{
			len++;
		}
		for(int i=len-1;i>=0;i--) {
			char c=s.charAt(i);
			System.out.print(c);
			
		}

	}

}
