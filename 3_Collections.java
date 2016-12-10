/*
  Note: ints are initialized to 0 by default and boolean to false.

*/

int[] ints = new int[10]
int[] ints = {1, 2, 3}

String[][] states = new String[3][2]
states[0][0] = "California"
states[0][1] = "Sacramentor"

//Common methods used:
myArray.length  //length of arr
Arrays.sort(myInts) //sort number array
System.arraycopy(myArr, 5, destinArry, 0, 5) //Copying array 2nd arg=first 5 elems of myArr 4th&5th args = first and last indices of destinArryy



  /*  ArrayLists  */
//ArrayList supports dynamic arrays that can grow as needed. Standard Java arrays are of a fixed length.
ArrayList al = new ArrayList();
/*or*/ ArrayList<String> al = new ArrayList();
al.size()

      // add elements to the array list
      al.add("C");
      al.add("A");
 
      al.add(1, "A2"); //probably replaces the elem at index 1 with A2
      System.out.println("Size of al after additions: " + al.size());
      al.get(2) //retrieve 2nd element
      al.indexOf("A2")  //firstOccurence
      al.lastIndexOf("A")
        
      al.contains("B3")
      al.clear()  //clears all
      // display the array list
      System.out.println("Contents of al: " + al);

      // Remove elements from the array list
      al.remove("F");
      al.remove(2);
