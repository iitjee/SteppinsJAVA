/*
String objects are immutable by default.
StringBuilder objects are however mutable

Note:  You can use any String method on a StringBuilder object by first converting the string builder to a string with the toString() method of the StringBuilder class. Then convert the string back into a string builder using the StringBuilder(String str) constructor.

      String+Integer = String => "Order number" + 23 = "Order Number 23"
*/



package java.lang.String //no need to declare explicitly

String s1 = "Hey!"
String s2 = new String("Hey");
String[] months = {"Jan", "Feb", "Mar", "Apr"}; 

// Characters to String
char[] charArray = {'A', 'E', 'I', 'O', 'U'};
String s3 = new String(charArray);

//String to Characters
String s4 = "hello";
char[] charArray2 = s4.toCharacterArray();


String fromBool = Boolean.toString(myBoolValue); //Boolean is a helper class

/* Useful Properties and methods of Strings*/
str.length()
str.indexOf("My Substring"); //gives position of first letter
str.substring(indexValue);
str.trim() //removes whitespace before and after
  
/* Useful Properties and methods of Char Arrays*/
chars.length


/*String to Char Array */
str.toCharArray()
        




//Equality checking - Best Example (This is what is called 'String Interning' )
        String str1 = "Hello";
        String str2 = "Hello";

        if (str1 == str2) {
            System.out.println("They match!"); //corerct
        } else {
            System.out.println("They don't match!");
        }

        String str3 = "hello";
        if (str1 == str3) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!"); //correct
        }

        String part1 = "Hello ";
        String part2 = "World";
        String str4 = part1 + part2;
        String str5 = "Hello World";
        if (str4.equalsIgnoreCase(str5)) {
            System.out.println("They match!"); //correct
        } else {
            System.out.println("They don't match!"); //correct if u use str4==str5
        }
//Moral: Always use str1.equals(str2) or str4.equalsIgnoreCase(str5) for equality checking to avoid this string interning


/*  String builder  */
//StringBuilder objects are like String objects, except that they can be modified(mutable). Internally, these objects are treated like variable-length arrays 
 StringBuilder sb = new StringBuilder();
sb.append("The capitol of ".append("America").append("is Washington"));

//useful methods(with constructors) and properties of StringBuilder
sb.length()
sb.append(anyObject)
sb.toString() //converts stringbuilder char seq into an array
sb.reverse()
StringBuilder() //Creates an empty string builder with a capacity of 16 (16 empty elements)
StringBuilder(CharSequence cs)	//Constructs a string builder containing the same characters as the specified CharSequence, plus an extra 16 empty elements trailing the CharSequence.
StringBuilder(int initCapacity)	//Creates an empty string builder with the specified initial capacity.
StringBuilder(String s)	//Creates a string builder whose value is initialized by the specified string, plus an extra 16 empty elements trailing the string.

sb.setLength(34)  //Sets the length of the character sequence. If 34<sb.length(), then last characters are simple truncated
sb.ensureCapacity(55) //Ensures that the capacity is at least equal to 55

sb.delete(startIndex, endIndex) //deletes the subsequence from startIndex to endIndex-1 (inclusive)
sb.deleteCharAt(int index)

//Note:  You can use any String method on a StringBuilder object by first converting the string builder to a string with the toString() method of the StringBuilder class. Then convert the string back into a string builder using the StringBuilder(String str) constructor.
//There is also a StringBuffer class that is exactly the same as the StringBuilder class, except that it is thread-safe by virtue of having its methods synchronized.














