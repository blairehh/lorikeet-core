package lorikeet.ioc;

import lorikeet.Axon;

public interface Cell1<ReturnType, Dependency1, SystemType> {
    ReturnType process(Axon<SystemType> axon, Dependency1 dependency1);

    default WiredCell<ReturnType, SystemType> requires(DependencyResolver<Dependency1, SystemType> dep) {
        return (Axon<SystemType> axon, SystemType system) -> process(axon, dep.resolve(system));
    }
}
