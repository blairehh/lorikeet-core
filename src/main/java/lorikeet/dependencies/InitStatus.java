package lorikeet.dependencies;

public interface InitStatus {
    void ready();
    void failed(Throwable cause);
}
