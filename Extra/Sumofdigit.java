class Sumofdigit{
             static String isdigit(String name)  
                  {
                   int length = name.length();
                   if(length==0 && length==9)
                       {
                         return ""+name.charAt(0);
                       }
                   else if(length==2)
                          {
                            char c1=name.charAt(0);
                            char c2=name.charAt(1);
                            int a=Character.getNumericValue(c1); 
                            int b=Character.getNumericValue(c2); 
                            return ""+(a+b);
                          }
                   return "Wrong digit";
                 }
public static void main(String[] args)
                 {
                     String name="12";
                     String c=isdigit(name);
                     System.out.println(c);
                 }
           }
	     