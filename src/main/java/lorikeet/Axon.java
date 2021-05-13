package lorikeet;


public class Axon<SystemType> {

    private final SystemType module;

    public Axon(SystemType module) {
        this.module = module;
    }

    public <ReturnType> ReturnType run(Cell<ReturnType, SystemType> cell) {
        return cell.junction()
            .invoke(this, this.module);
    }
}
