public class Test {

    public static void main(String[] args){

        Light light1 = new Light();

        ICommand LightOn = new LightOnCommand(light1);
        ICommand LightOff = new LightOffCommand(light1);
        ICommand DimUp = new DimUpCommand(light1);
        ICommand DimDown = new DimDownCommand(light1);

        Invoker remote = new Invoker(LightOn , LightOff , DimUp , DimDown);

        remote.pressOnButton();
        remote.pressUpButton();

    }

}
