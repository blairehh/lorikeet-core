package lorikeet;

public interface Axon<SystemType> {
    <ReturnType> ReturnType run(Cell<ReturnType, SystemType> cell);
}
