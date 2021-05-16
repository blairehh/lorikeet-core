package lorikeet.dependencies;

public interface Dependency {
    InitStatus init();
    RetireStatus retire();
    CheckStatus check();
    long version();
    String name();
}
