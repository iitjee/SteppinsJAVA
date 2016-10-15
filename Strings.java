
package java.lang.String //no need to declare explicitly

String s1 = "Hey!"
String s2 = new String("Hey");


// Characters to String
char[] charArray = {'A', 'E', 'I', 'O', 'U'};
String s3 = new String(charArray);

//String to Characters
String s4 = "hello";
char[] charArray2 = s4.toCharacterArray();


String fromBool = Boolean.toString(myBoolValue); //Boolean is a helper class



//Equality checking - Best Example (This is what is called 'String Interning' )
        String str1 = "Hello";
        String str2 = "Hello";

        if (str1 == str2) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }

        String str3 = "hello";
        if (str1 == str3) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }

        String part1 = "Hello ";
        String part2 = "WORLD";
        String str4 = part1 + part2;
        String str5 = "Hello World";
        if (str4.equalsIgnoreCase(str5)) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }
//Moral: Always use str1.equals(str2) or str4.equalsIgnoreCase(str5) for equality checking


/* Useful Properties and methods */
str.length()
str.indexOf("My Substring"); //gives position of first letter
str.substring(indexValue);
str.trim() //removes whitespace before and after
  






















