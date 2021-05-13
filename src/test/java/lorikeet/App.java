package lorikeet;

public class App {
    private final int maxAge;

    public App(int maxAge) {
        this.maxAge = maxAge;
    }

    public static DependencyResolver<Integer, App> maxAge() {
        return (app) -> app.maxAge;
    }

    public static DependencyResolver<String, App> foo() {
        return (app) -> "app.maxAge";
    }
}
