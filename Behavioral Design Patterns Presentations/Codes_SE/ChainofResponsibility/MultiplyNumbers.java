public class MultiplyNumbers implements Chain{ //class3
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextInChain) {

        this.nextInChain = nextInChain;

    }

    @Override
    public void calculate(Numbers request) {

        if(request.getcalW() == "mul"){
            System.out.println(request.getNumber1() + " * " + request.getNumber2() + " = " +
                    (request.getNumber1()*request.getNumber2()));
        }
        else{
            nextInChain.calculate(request);
        }

    }

}


