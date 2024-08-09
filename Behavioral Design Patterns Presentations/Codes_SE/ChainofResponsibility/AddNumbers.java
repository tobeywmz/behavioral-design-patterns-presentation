public class AddNumbers implements Chain{ //class1

    private Chain nextInChain; //the value differs for each class so it is like this

    @Override
    public void setNextChain(Chain nextInChain8) { //the implemented method 1 :that will be more specific in the main class soon

        this.nextInChain = nextInChain;

    }

    @Override
    public void calculate(Numbers request) { //the 2nd implemented method for this one class

        if(request.getcalW() == "add"){
            System.out.println(request.getNumber1() + " + " + request.getNumber2() + " = " +
                    (request.getNumber1()+request.getNumber2()));
        }
        else{ //tell us if the req =! "add" then pass the request to the next object in the chain
            nextInChain.calculate(request);
        }

    }

}
