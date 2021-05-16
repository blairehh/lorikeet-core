package lorikeet.ioc;

import lorikeet.Axon;

public interface Cell2<ReturnType, Dependency1, Dependency2, KernelType> {
    ReturnType process(Axon<KernelType> axon, Dependency1 dependency1, Dependency2 dependency2);

    default WiredCell<ReturnType, KernelType> requires(
        DependencyResolver<Dependency1, KernelType> dependency1,
        DependencyResolver<Dependency2, KernelType> dependency2
    ) {
        return (Axon<KernelType> axon, KernelType kernel) -> process(
            axon,
            dependency1.resolve(kernel),
            dependency2.resolve(kernel)
        );
    }
}
