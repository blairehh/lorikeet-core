package lorikeet.dependencies;

public sealed interface InitStatus {
    record Ready() implements InitStatus {}
    record Failed(Throwable cause) implements InitStatus {}
}
