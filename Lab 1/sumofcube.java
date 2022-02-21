//Create a method to find the sum of the cubes of the digits of an n digit number
class sumofcube{
 static int sumofserices(int n)
{
        int sum = 0;
        for (int x=1; x<=n; x++)
            sum += x*x*x;
        return sum;
    }
public static void main(String args[])
{

int n=5;
System.out.println(sumofserices(n));
}
}