public class Invoker {

    private ICommand on;
    private ICommand off;
    private ICommand up;
    private ICommand down;

    public Invoker(ICommand on, ICommand off, ICommand up, ICommand down){
        this.on = on;
        this.off=off;
        this.up=up;
        this.down=down;
    }

    public void pressOnButton(){
        on.execute();
    }
    public void pressOffButton(){
        off.execute();
    }
    public void pressUpButton(){
        up.execute();
    }
    public void pressDownButton(){
        down.execute();
    }

}
