
public class strongnumberrec {

	public static void main(String[] args) {
		strongnum s=new strongnum();
		String rse=s.strnum(145, 145, 0);
		if(rse==" strong number")
			
		   System.out.println(145+" " +rse);
		

	}

}
class strongnum
{
	String strnum(int num,int temp,int sum)
	{
		if(num==0)
		{
			if(sum==temp)
			{
				return " strong number";
			}
			else
			{
				return " not a strong number";
			}
		}
		else
		{
			int rem=num%10;
			int fact=1;
			for(int i=rem;i>0;i--)
			{
				fact=fact*i;
			}
			sum+=fact;			
			return strnum(num/10,temp,sum);
			
		}
	}
}
