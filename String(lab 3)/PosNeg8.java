import java.util.Arrays;
 class PosNeg8{
    static boolean isAlphabaticOrder(String s)
    {
        int n = s.length();
        char c[] = new char [n];
        for (int i = 0; i < n; i++) {
            c[i] = s.charAt(i);
        }
        Arrays.sort(c);
        for (int i = 0; i < n; i++)
            if (c[i] != s.charAt(i)) 
                return false;
            return true;    
    }
     
    public static void main(String args[])
    {
        String s = "ANT";
        if (isAlphabaticOrder(s))
           System.out.println("Positive");
        else
            System.out.println("Negative");      
    }
}