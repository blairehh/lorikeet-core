package lorikeet.ioc;

import lorikeet.Axon;

public interface Cell3<ReturnType, Dependency1, Dependency2, Dependency3, KernelType> {
    ReturnType process(
        Axon<KernelType> axon,
        Dependency1 dependency1,
        Dependency2 dependency2,
        Dependency3 dependency3
    );

    default WiredCell<ReturnType, KernelType> requires(
        DependencyResolver<Dependency1, KernelType> dependency1,
        DependencyResolver<Dependency2, KernelType> dependency2,
        DependencyResolver<Dependency3, KernelType> dependency3
    ) {
        return (Axon<KernelType> axon, KernelType kernel) -> process(
            axon,
            dependency1.resolve(kernel),
            dependency2.resolve(kernel),
            dependency3.resolve(kernel)
        );
    }
}
