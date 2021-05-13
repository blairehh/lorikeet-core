package lorikeet;

import lorikeet.ioc.Cell1;
import lorikeet.ioc.WiredCell;

import static lorikeet.App.maxAge;

public interface MaxAgeAction<R> extends Cell<R, App> {
    R run(Axon<App> axon, Integer maxAge);

    default WiredCell<R, App> junction() {
        return ((Cell1<R, Integer, App>)(this::run))
            .requires(maxAge());
    }
}
