package lorikeet;

public class TestAxon<KernelType> implements Axon<KernelType> {

    private final KernelType kernel;

    public TestAxon(KernelType kernel) {
        this.kernel = kernel;
    }

    @Override
    public <ReturnType> ReturnType run(Cell<ReturnType, KernelType> cell) {
        return cell.junction()
            .invoke(this, this.kernel);
    }
}
