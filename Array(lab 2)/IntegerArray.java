import java.util.Arrays;
class IntegerArray
{
static int[] getSorted(int[] arr)
{
int n=arr.length;
for(int i=0;i<n/2;i++)
{
int temp=arr[i];
arr[i]=arr[n-i-1];
arr[n-i-1]=temp;
}
Arrays.sort(arr);
return new int[]{arr[0],arr[1],arr[2],arr[3],arr[4]};
}
public static void main(String[] args)
{
int[] arr={10,13,12,16,15};
int[] c=getSorted(arr);
for(int i:c)
System.out.println(i+"");
}
}