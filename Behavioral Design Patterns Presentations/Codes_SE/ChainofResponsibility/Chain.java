public interface Chain { //the chain interface to begin with

    public void setNextChain(Chain nextChain);

    public void calculate(Numbers request);

    //we will determine the details of each one of these in the classes that implement this interface

}
