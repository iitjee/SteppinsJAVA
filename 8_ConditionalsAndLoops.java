


//if - else if
same as in C
If only one line => can omit braces

//switch
int month = 2;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3: case 4: 
            case 5: case 6: 
                monthString = "same for 3, 4, 5, 6"
            default: monthString = "Sorry";
                     break; //this is technically not required
        }
        System.out.println(monthString);
    }
}

//Strings in switch 
switch (month.toLowerCase()) {
            case "january":
                monthNumber = 1;
                break;
            case "february":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
                break;
}
//Ensure that the expression in any switch statement is not null to prevent a NullPointerException from being thrown.
                     

for in loop
String[] months = {"Jan", "Feb", "Mar", "Apr"}; 
  for(String month: months) {
      System.out.println(months);
  }

do-while
do {
//block of code
} while(condn);















