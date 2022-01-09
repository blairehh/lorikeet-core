package lorikeet.dependencies;

public sealed interface RetireStatus {
    record Stopped() implements RetireStatus {}
    record Failed(Throwable cause) implements RetireStatus {}
}
