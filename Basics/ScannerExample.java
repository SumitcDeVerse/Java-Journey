import  java.util.*;
public class ScannerExample {
  
    public static void main(String[] args) {
        
    
    Scanner sc = new  Scanner(System.in);
    System.out.println("Hello to my Java-Journey Verse!");

    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("sum is + " + a + b);

//     // float c = sc.nextFloat();
//     // double d = sc.nextDouble();
//     // String x = sc.next();
//     // String y = sc.nextLine();
//     // byte z = sc.nextByte();
//     // short p = sc.nextShort();
//     // long q = sc.nextLong();
//     // boolean r = sc.nextBoolean();

    while(sc.hasNextInt()) {   // Example of hasNextInt

  System.out.println(sc.nextInt()); 
}


System.out.println("enter your name ");
String name = sc.nextLine();
System.out.println("Welcome "+ name);


// Datatype and it's range 
System.out.println("Int min , Max , Bytes "+ Integer.MIN_VALUE +"  "+ Integer.MAX_VALUE + " " + Integer.BYTES);
System.out.println("Char min , Max , Bytes "+ Character.MIN_VALUE +"  "+ Character.MAX_VALUE + " " + Character.BYTES);
System.out.println("Float min , Max , Bytes "+ Float.MIN_VALUE +"  "+ Float.MAX_VALUE + " " + Float.BYTES);
System.out.println("Doouble min , Max , Bytes "+ Double.MIN_VALUE +"  "+ Double.MAX_VALUE + " " + Double.BYTES);
System.out.println("Doouble min , Max , Bytes "+ Byte.MIN_VALUE +"  "+ Byte.MAX_VALUE + " " + Byte.BYTES);

   
}

}
