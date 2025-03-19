package JavaPrograms;

public class Palindrome {

	public static void main(String[] args) {
		
		int num=123;
		
		int org_num=num;
		int rev=0;
		
		while(num!=0)
		{
			int sum=num%10;
			
			rev=rev*10+sum;
			
			num=num/10;
		}

		System.out.println(rev);
		
		System.out.println(num);
		
		System.out.println(org_num);
		
	if(org_num==rev)
	{
		System.out.println("Palindrom number");
	}
	else
	{
		System.out.println("Not a Palindrom number");
	}
	}	

}
