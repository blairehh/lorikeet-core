package lorikeet.ioc;

import lorikeet.Axon;

public interface Cell3<ReturnType, Dependency1, Dependency2, Dependency3, SystemType> {
    ReturnType process(
        Axon<SystemType> axon,
        Dependency1 dependency1,
        Dependency2 dependency2,
        Dependency3 dependency3
    );

    default WiredCell<ReturnType, SystemType> requires(
        DependencyResolver<Dependency1, SystemType> dependency1,
        DependencyResolver<Dependency2, SystemType> dependency2,
        DependencyResolver<Dependency3, SystemType> dependency3
    ) {
        return (Axon<SystemType> axon, SystemType system) -> process(
            axon,
            dependency1.resolve(system),
            dependency2.resolve(system),
            dependency3.resolve(system)
        );
    }
}
