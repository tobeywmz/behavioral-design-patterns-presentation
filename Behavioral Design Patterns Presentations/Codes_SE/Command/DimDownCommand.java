public class DimDownCommand implements ICommand{

    private Light light;

    public DimDownCommand(Light light){
        this.light=light;
    }


    @Override
    public void execute() {
        light.dimdown();
    }

    @Override
    public void unexecute() {
        light.dimup();

    }
}
