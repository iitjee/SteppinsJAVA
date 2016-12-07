/*

keywords:
static => class method






*/



//vararg methods
static double addValues(String ... values)  { //vararg is taken as an array
  double result = 0;
  for(String value: values) {
    dobule d = Double.parseDouble(value);
    result += d;
    





