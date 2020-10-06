package cse360assignment02;

public class AddingMachine {

public static void main(String[] args) {
    AddingMachine myCalculator = new AddingMachine();
    myCalculator.add(4);
    myCalculator.subtract(2);
    myCalculator.add(5);
    System.out.println(myCalculator.toString());

}

  private int total;
  private String mystr;
  
  //Contructor:sets an initial value
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    mystr = "0" ;
  }
  
  //A function that returns the total value at any given point
  public int getTotal () {
    return 0;
  }
  
  //Adds value and total
  public void add (int value) {
        total = total + value;
        mystr = mystr + "+" + value;
  }

//Subtracts value and total 
  public void subtract (int value) {
        total = total - value;
        mystr = mystr + "-" + value;
  }

//Returns the current string
  public String toString () {
    return mystr;
  }

//resets the  total and the string variable
  public void clear() {
      total = 0;
      mystr = "0";
  }
}