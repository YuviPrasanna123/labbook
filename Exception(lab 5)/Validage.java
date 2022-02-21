package exception;

import java.util.Scanner;

public class Validage {
 public static void main(String args[]) {
  Scanner sc= new Scanner(System.in);
  System.out.print("Enter ur age  ");
  int age = sc.nextInt();
  
  try {
   if(age < 18) 
    throw new AgeException("Invalid age");
   else
    System.out.println("Valid age");
  }
  catch (AgeException a) {
   System.out.println(a);
  }
 }
}

