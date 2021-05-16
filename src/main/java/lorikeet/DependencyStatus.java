package lorikeet;

public interface DependencyStatus {
    void ready();
    void failed(Throwable cause);
}
