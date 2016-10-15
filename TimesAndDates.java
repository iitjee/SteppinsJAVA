/*


*/





Date todayDate = new Date();

/* Date Formatting before Java 8 (Don't use this :/ ) */
GregorianCalendar gc = new GregorianCalendar(2009, 1, 28); //Note: 0:January. => 1:Feb
gc.add(GregorianCalendar.DATE, 1); //add one day to gc
Date d2 = gc.getTime();

DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
System.out.println(df.format(d2));

/* Latest style of Date Formatting */
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDate ld = LocalDate.of(2009, 1, 28);
        System.out.println(ld);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyyy");
        System.out.println(dtf.format(ld));


