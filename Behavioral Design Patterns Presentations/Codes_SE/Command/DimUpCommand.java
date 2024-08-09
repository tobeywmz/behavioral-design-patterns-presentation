public class DimUpCommand implements ICommand{

    private Light light;

    public DimUpCommand(Light light){
        this.light=light;
    }


    @Override
    public void execute() {
        light.dimup();
    }

    @Override
    public void unexecute() {
        light.dimdown();

    }
}
