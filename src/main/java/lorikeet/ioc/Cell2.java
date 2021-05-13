package lorikeet.ioc;

import lorikeet.Axon;
import lorikeet.DependencyResolver;

public interface Cell2<ReturnType, Dependency1, Dependency2, SystemType> {
    ReturnType process(Axon<SystemType> axon, Dependency1 dependency1, Dependency2 dependency2);

    default WiredCell<ReturnType, SystemType> requires(
        DependencyResolver<Dependency1, SystemType> dependency1,
        DependencyResolver<Dependency2, SystemType> dependency2
    ) {
        return (Axon<SystemType> axon, SystemType system) -> process(
            axon,
            dependency1.resolve(system),
            dependency2.resolve(system)
        );
    }
}
