








/* Number Formatting */
        long longValue = 10_000_000;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String myStringFormatted = formatter.format(longValue);
        System.out.println(myStringFormatted);

//For Currency, use getCurrencyInstance() :)


//Converting Number to String
String.valueOf(number)
Integer.toString(number)
""+number;      //a bit overhead as it does the following:
/* behind the scenes of ""+number */
StringBuilder sb = new StringBuilder();
sb.append("");
sb.append(number);
return sb.toString();



/* Booleans */
boolean myNumber = false;

//Boolean Strings
String myBoolString = "true";
boolean parsed = Boolean.parseBoolean(myBoolString);




/* Characters */
char c1 = '1'; //wrapped in single quotes
char a1 = 'a';

Character.toUpperCase(a1);



