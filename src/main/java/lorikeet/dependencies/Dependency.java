package lorikeet.dependencies;

public interface Dependency {
    void init(InitStatus status);
    void retire(RetireStatus status);
    void check(CheckStatus status);
    long version();
    String name();
}
