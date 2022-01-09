package lorikeet.dependencies;

public interface Dependency extends ConstDependency {
    InitStatus init();
    RetireStatus retire();
    CheckStatus check();
}
