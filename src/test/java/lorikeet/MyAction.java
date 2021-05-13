package lorikeet;

public record MyAction() implements MaxAgeAction<String>  {
    public String run(Axon<App> axon, Integer foo) {
        return String.valueOf(foo);
    }
}
