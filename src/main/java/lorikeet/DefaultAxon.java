package lorikeet;


public class DefaultAxon<SystemType> implements Axon<SystemType> {

    private final SystemType module;

    public DefaultAxon(SystemType module) {
        this.module = module;
    }

    @Override
    public <ReturnType> ReturnType run(Cell<ReturnType, SystemType> cell) {
        return cell.junction()
            .invoke(this, this.module);
    }
}
