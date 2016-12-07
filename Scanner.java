/*
The Java Scanner class breaks the input into tokens using a delimiter which is whitespace bydefault.
Java Scanner class is widely used to parse text for string and primitive types using regular expression.

see the use of nextInt(), next(), nextDouble(), nextLine()
*/

import java.util.Scanner;  

class ScannerTest{  
 public static void main(String args[]){  
 
   Scanner sc=new Scanner(System.in);  
     
   System.out.println("Enter your rollno");  
   int rollno=sc.nextInt(); 
  
   System.out.println("Enter your name");  
   String name=sc.next();  
  
   System.out.println("Enter your fee");  
   double fee=sc.nextDouble();  
   System.out.println("Rollno:"+rollno+" name:"+name+" fee:"+fee);  

   System.out.print("Enter Some Text: ");
   String inputVar = sc.nextLine();
   System.out.println(inputVar);

   sc.close();  
 }  
} 
