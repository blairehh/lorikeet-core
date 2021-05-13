package lorikeet.ioc;

import lorikeet.Axon;
import lorikeet.DependencyResolver;

public interface Cell10<
    ReturnType,
    Dependency1,
    Dependency2,
    Dependency3,
    Dependency4,
    Dependency5,
    Dependency6,
    Dependency7,
    Dependency8,
    Dependency9,
    Dependency10,
    SystemType
    > {

    ReturnType process(
        Axon<SystemType> axon,
        Dependency1 dependency1,
        Dependency2 dependency2,
        Dependency3 dependency3,
        Dependency4 dependency4,
        Dependency5 dependency5,
        Dependency6 dependency6,
        Dependency7 dependency7,
        Dependency8 dependency8,
        Dependency9 dependency9,
        Dependency10 dependency10
    );

    default WiredCell<ReturnType, SystemType> requires(
        DependencyResolver<Dependency1, SystemType> dependency1,
        DependencyResolver<Dependency2, SystemType> dependency2,
        DependencyResolver<Dependency3, SystemType> dependency3,
        DependencyResolver<Dependency4, SystemType> dependency4,
        DependencyResolver<Dependency5, SystemType> dependency5,
        DependencyResolver<Dependency6, SystemType> dependency6,
        DependencyResolver<Dependency7, SystemType> dependency7,
        DependencyResolver<Dependency8, SystemType> dependency8,
        DependencyResolver<Dependency9, SystemType> dependency9,
        DependencyResolver<Dependency10, SystemType> dependency10
    ) {
        return (Axon<SystemType> axon, SystemType system) -> process(
            axon,
            dependency1.resolve(system),
            dependency2.resolve(system),
            dependency3.resolve(system),
            dependency4.resolve(system),
            dependency5.resolve(system),
            dependency6.resolve(system),
            dependency7.resolve(system),
            dependency8.resolve(system),
            dependency9.resolve(system),
            dependency10.resolve(system)
        );
    }
}
