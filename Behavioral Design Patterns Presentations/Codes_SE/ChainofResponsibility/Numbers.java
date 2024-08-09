public class Numbers { //the numbers to begin with after the chain interface

    private int number1;
    private int number2;
    private String calculationWanted;

    public Numbers(int newNumber1, int newNumber2, String calcWanted){ //we get all of them here
        number1 = newNumber1; //determine each input of Numbers...
        number2 = newNumber2;
        calculationWanted = calcWanted;
    }

    //so we get the numbers and request public here
    public int getNumber1() {return number1;}
    public int getNumber2() {return number2;}
    public String getcalW() {return calculationWanted;}

}
