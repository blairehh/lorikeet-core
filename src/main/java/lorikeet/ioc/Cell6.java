package lorikeet.ioc;

import lorikeet.Axon;
import lorikeet.DependencyResolver;

public interface Cell6<
    ReturnType,
    Dependency1,
    Dependency2,
    Dependency3,
    Dependency4,
    Dependency5,
    Dependency6,
    SystemType
    > {

    ReturnType process(
        Axon<SystemType> axon,
        Dependency1 dependency1,
        Dependency2 dependency2,
        Dependency3 dependency3,
        Dependency4 dependency4,
        Dependency5 dependency5,
        Dependency6 dependency6
    );

    default WiredCell<ReturnType, SystemType> requires(
        DependencyResolver<Dependency1, SystemType> dependency1,
        DependencyResolver<Dependency2, SystemType> dependency2,
        DependencyResolver<Dependency3, SystemType> dependency3,
        DependencyResolver<Dependency4, SystemType> dependency4,
        DependencyResolver<Dependency5, SystemType> dependency5,
        DependencyResolver<Dependency6, SystemType> dependency6
    ) {
        return (Axon<SystemType> axon, SystemType system) -> process(
            axon,
            dependency1.resolve(system),
            dependency2.resolve(system),
            dependency3.resolve(system),
            dependency4.resolve(system),
            dependency5.resolve(system),
            dependency6.resolve(system)
        );
    }
}
