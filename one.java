//Write a Java program to get the character at the given index within the string.
//Sample Output:Original String = Java Exercises!
//The character at position 0 is J
//The character at position 10 is i 

class one {

    public static void main( String args[]) {

        String str = "Java Exercises";

        System.out.println("original string : " + str); 

        int index1 = str.charAt(0);
        int index2 = str.charAt(10);

        System.out.println("The character at position 0 :" +(char)index1);
        System.out.println("The character at position 10 :" +(char)index2);
 }

 
}