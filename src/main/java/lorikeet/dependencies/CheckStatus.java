package lorikeet.dependencies;

public sealed interface CheckStatus {
    record Healthy() implements CheckStatus {}
    record Unhealthy(Throwable cause) implements CheckStatus {}
}
