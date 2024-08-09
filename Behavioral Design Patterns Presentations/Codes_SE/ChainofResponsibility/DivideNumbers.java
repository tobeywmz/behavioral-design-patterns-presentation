public class DivideNumbers implements Chain { //class4
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextInChain) {

        this.nextInChain = nextInChain;

    }

    @Override
    public void calculate(Numbers request) {

        if(request.getcalW() == "div"){
            System.out.println(request.getNumber1() + " / " + request.getNumber2() + " = " +
                    (request.getNumber1()/request.getNumber2()));
        }
        else{
            System.out.println("This calculation only works for: add , subtract , multiply and divide.");
        }

    }

}


