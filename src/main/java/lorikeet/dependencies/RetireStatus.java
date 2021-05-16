package lorikeet.dependencies;

public interface RetireStatus {
    void failed(Throwable cause);
    void stopped();
}
