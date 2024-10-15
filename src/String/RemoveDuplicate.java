package String;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String s="poonam";
		char a[]=s.toCharArray();
		String newstr="";
		for(int i=0;i<a.length;i++) {
		
			if(i==0)
			{
				newstr=newstr+s.charAt(i);
			}else
			{
				if(s.charAt(i-1)!= s.charAt(i))
				{
					newstr=newstr+s.charAt(i);

				}
			}
		}
		System.out.println(newstr);
		}
}
