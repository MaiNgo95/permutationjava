//get the input then take the inoput into string
// alist of striwng, we will take the 1st char out of the list of string
// we take that substring, we gonna take the 1st char put inside the substring
import java.util.Scanner;
import java.util.HashSet;
//import java.ulti.Set;

class Main {
  public static HashSet <String> myFunc(String userInput){ //use String as wrapper class after define Set
    HashSet <String> myList = new HashSet<String>(); //creaste a hashset for the substring
    if (userInput == null){ //check if the string is empty or nothing in the string with length == 0
      return null;

    }else if (userInput.length()==0){
      myList.add("");
      return myList;
    }

  //take the first character out of the String input
    char initial = userInput.charAt(0);
    String remainChar = userInput.substring(1); //use string method to cut the string into the list we want
    //put the string into an array
    HashSet <String> subString = new HashSet<String>();
    subString.add(remainChar); //create a set for remain character in the string
    for (String i : subString ){
      for (int a =0; a< i.length(); a++){
        myList.add(charInsert(i, initial, a)); //crate a function to get the characters into the list
      }
    }
    return myList;
  }
  public static String charInsert(String str, char c, int b){ 
    String begin = str.substring(0,b);
    String end = str.substring(b);
    return begin + c + end;
  }
  public static void main(String[] args) { //get user input
    Scanner inEnter = new Scanner(System.in);
    String inPut = inEnter.nextLine();
    System.out.println(inPut);
    System.out.println(myFunc(inPut)); //output the function
    
  }
}
