package lorikeet.ioc;

import lorikeet.Axon;

public interface Cell5<ReturnType, Dependency1, Dependency2, Dependency3, Dependency4, Dependency5, KernelType> {
    ReturnType process(
        Axon<KernelType> axon,
        Dependency1 dependency1,
        Dependency2 dependency2,
        Dependency3 dependency3,
        Dependency4 dependency4,
        Dependency5 dependency5
    );

    default WiredCell<ReturnType, KernelType> requires(
        DependencyResolver<Dependency1, KernelType> dependency1,
        DependencyResolver<Dependency2, KernelType> dependency2,
        DependencyResolver<Dependency3, KernelType> dependency3,
        DependencyResolver<Dependency4, KernelType> dependency4,
        DependencyResolver<Dependency5, KernelType> dependency5
    ) {
        return (Axon<KernelType> axon, KernelType kernel) -> process(
            axon,
            dependency1.resolve(kernel),
            dependency2.resolve(kernel),
            dependency3.resolve(kernel),
            dependency4.resolve(kernel),
            dependency5.resolve(kernel)
        );
    }
}
