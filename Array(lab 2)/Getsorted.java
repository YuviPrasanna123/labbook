import java.util.*;
class Getsorted{
static int[] getSorted(int[] arr){
int n=arr.length;
for(int j=0;j<n/2;j++)
{
int temp=arr[j];
arr[j]=arr[n-j-1];
arr[n-j-1]=temp;
}
Arrays.sort(arr);
return arr;
}
public static void main(String[] args){
int[] arr={10,20,30,40,50};
int[] c=getSorted(arr);
for(int j:c)
System.out.println(j+"");
}
}