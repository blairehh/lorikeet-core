package lorikeet;

public interface Axon<KernelType> {
    <ReturnType> ReturnType run(Cell<ReturnType, KernelType> cell);
}
