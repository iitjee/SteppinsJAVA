








/* Number Formatting */
        long longValue = 10_000_000;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String myStringFormatted = formatter.format(longValue);
        System.out.println(myStringFormatted);


NumberFormat formatter = new DecimalFormat("#0.00"); //gets upto two decimal places
System.out.println(formatter.format(4.0));
DecimalFormat formatter = new DecimalFormat("#0.00"); //this also works fine
//returned formatted value is in string format.

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

//Converting String to Number
int foo = Integer.parseInt("1234");
double doo = Double.parseDouble("12.24");
//Note that exceptions may arise if not proper. So handle them

/*      String+Integer = String */
"Order number" + 23 = "Order Number 23"

/* Booleans */
boolean myNumber = false;

//Boolean Strings
String myBoolString = "true";
boolean parsed = Boolean.parseBoolean(myBoolString);




/* Characters */
char c1 = '1'; //wrapped in single quotes
char a1 = 'a';

Character.toUpperCase(a1);



