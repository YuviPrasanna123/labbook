class Clasum
{
public static int calculateSum(int n)
{
int sum = 0;

for(int i=1;i<=n;i++)
{
if(i%3 == 0 || i%5 == 0)
sum = sum + i;
}
return sum;
}

public static void main(String args[])
{
int n=10;
int res = calculateSum(n);	
System.out.println("Sum  :"+res);
	}
}