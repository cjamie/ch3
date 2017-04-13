/**
 *
 * @author huanj
 * CHAPTER 3: Core Java APIs 
 *
 * SUMMARY: 
 * 
 * (1)Strings are a fundamental class that does not need new keyword to instantiate
 *      1.1* Concatenation 
 *      1.2* Immutability
 *      1.3* String Pool
 *      1.4* String Methods
 * (2) StringBuilder object 
 * (3) equality operator on String objects
 * (4) Arrays
 * (5)ArrayList object
 * --its use with generics
 * ()autoboxing
 * 
 * (6)LocalDate, LocalTime, and LocalDateTime objects
 * 
 * 
 * 
 * ()Date and Times object
 * 
 * 
 */

public class Chapter3 {
   public static void main(String[] args){
       A();
       B();
       C();
       D();
     
   }
   /*
   1.1* concatenation rules:
   -number + number=number
   -String + anything=concatenation;
   -evaluated left to right 
   */ 
   static void A(){
       System.out.println("Method A:");
       System.out.println(1+2); //number+number
       System.out.println(2+'b'+"c"); //number+char->number+string=100c
       System.out.println("a"+2); // String+anything
   }
   /*
   1.2* Immutability: an object that can't be changed once it has been created
   */
   
   static void B(){
       System.out.println("\nMethod B:");
       String a="abc";
       a=a.concat("d");
       System.out.println("a does not change:");
   }
   /*
   1.3* String Pool
   Strings from same part of string pool are re-used if both created without 
   new keyword and have the same content value
   
   == equality operator compares physical address
   */
   static void C(){
       String a="bcd";
       String b= new String("bcd");
       String c="bcd";
       System.out.println("\nMethod C:");
       System.out.println(a==b); //false because a is in string pool, b is not
       System.out.println(b==c); //b not in string pool, c is
       System.out.println(c==a); //a and c are both in string pool with same value
      
   }
   
   /*length, charAt, indexOf, substring, toLowerCase, toUpperCase, equals,
   equalsIgnoreCase, startsWith, endsWith, contains, replace, trim 
   */
   static void D(){
       String a="qweRty";
       System.out.println("\nMethod D:" + a);
       System.out.println("1"+ a.length()); //1
       System.out.println("2"+a.charAt(2)); //2
       System.out.println("3"+a.indexOf(1)); //3
       System.out.println("4"+a.substring(3)); //4
       System.out.println("5"+a.toLowerCase()); //5
       System.out.println("6"+a.toUpperCase()); //6
       System.out.println("7"+a.equals(a.substring(6))); //7
       System.out.println("8"+a.equalsIgnoreCase(a.substring(6))); //8
       System.out.println("9"+a.startsWith("s")); //9
       System.out.println("10"+a.endsWith("w")); //20
       
   }
   
   static void E(){
       String g; 
   }
}
