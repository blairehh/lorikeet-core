package lorikeet.ioc;

import lorikeet.Axon;

public interface Cell9<
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
    KernelType
    > {

    ReturnType process(
        Axon<KernelType> axon,
        Dependency1 dependency1,
        Dependency2 dependency2,
        Dependency3 dependency3,
        Dependency4 dependency4,
        Dependency5 dependency5,
        Dependency6 dependency6,
        Dependency7 dependency7,
        Dependency8 dependency8,
        Dependency9 dependency9
    );

    default WiredCell<ReturnType, KernelType> requires(
        DependencyResolver<Dependency1, KernelType> dependency1,
        DependencyResolver<Dependency2, KernelType> dependency2,
        DependencyResolver<Dependency3, KernelType> dependency3,
        DependencyResolver<Dependency4, KernelType> dependency4,
        DependencyResolver<Dependency5, KernelType> dependency5,
        DependencyResolver<Dependency6, KernelType> dependency6,
        DependencyResolver<Dependency7, KernelType> dependency7,
        DependencyResolver<Dependency8, KernelType> dependency8,
        DependencyResolver<Dependency9, KernelType> dependency9
    ) {
        return (Axon<KernelType> axon, KernelType kernel) -> process(
            axon,
            dependency1.resolve(kernel),
            dependency2.resolve(kernel),
            dependency3.resolve(kernel),
            dependency4.resolve(kernel),
            dependency5.resolve(kernel),
            dependency6.resolve(kernel),
            dependency7.resolve(kernel),
            dependency8.resolve(kernel),
            dependency9.resolve(kernel)
        );
    }
}
