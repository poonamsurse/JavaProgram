package Number;

public class PrimeNumber {

	public static void main(String[] args) {
		String primenumber="";
		for(int i=0;i<=100;i++)
		{
			int counter=0;
			for(int j=i;j>=1;j--)
			{
				
				if(i%j==0)
				{
					counter=counter+1;
				}
			}
		
			if( counter ==2)
			{
				primenumber=primenumber+i+" ";
			}
		}
		System.out.println(primenumber);

	}

}
