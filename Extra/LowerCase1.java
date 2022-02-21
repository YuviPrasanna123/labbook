class LowerCase1{
    public static void main(String args[])
    {
        String name="My Company Name Is Capgemini";
        String st=name.toLowerCase();
        System.out.println(name.toLowerCase());
        String[] str=st.split(" ");
        for(int i=0;i<str.length;i++)
                  {
                     //for(int j=0;j<i.length;j++){
                   if(str[i].charAt(0)=='c' && str[i].charAt(2)=='m')
                       //  if(i[0]=='c' && i[2]=='m')
                          System.out.println(str[i]);
                   }

    }
}