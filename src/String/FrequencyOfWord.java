package String;

import java.util.Arrays;

public class FrequencyOfWord {

	public static void main(String[] args) {
		String s="i am poonam surse I am ";
		String[] a=s.split(" ");
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					count++;
				}else
				{
					break;
				}
			}
			System.out.println(a[i] +"  "+count);
			i=i+count-1;
		}

	}

}
