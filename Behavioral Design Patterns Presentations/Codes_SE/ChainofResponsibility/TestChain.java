public class TestChain { //the final class to test the chain

    public static void main(String[] args){

        //we determine the objects of our chain here
        Chain ChainCalc1 = new AddNumbers();
        Chain ChainCalc2 = new SubtractNumbers();
        Chain ChainCalc3 = new MultiplyNumbers();
        Chain ChainCalc4 = new DivideNumbers();

        //we determine how the chains objects come after eachother here
        ChainCalc1.setNextChain(ChainCalc2);
        ChainCalc2.setNextChain(ChainCalc3);
        ChainCalc3.setNextChain(ChainCalc4);

        Numbers request = new Numbers( 4 , 2 , "add");
        ChainCalc1.calculate(request); //we pass this request to the first object in the chain and then leave it to go and do its job

    }
}
