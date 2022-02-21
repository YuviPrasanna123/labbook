class Smallest{
   public static int getSecondSmallest (int[] a) {
      int temp;
      for (int i = 0; i < a.length; i++) {
         for (int j = i + 1; j < a.length; j++) {
            if (a[i] > a[j]) {
               temp = a[i];
               a[i] = a[j];
               a[j] = temp;
            }
         }
      }
      //return smallest element
      return a[1];
   }
   public static void main(String args[]) {
      int a[] = { 11,10,4, 15, 16, 13, 2 };
      System.out.println("Smallest: " + getSecondSmallest (a));
   }
}