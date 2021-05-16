package lorikeet.ioc;

import lorikeet.Axon;

public interface Cell1<ReturnType, Dependency1, KernelType> {
    ReturnType process(Axon<KernelType> axon, Dependency1 dependency1);

    default WiredCell<ReturnType, KernelType> requires(DependencyResolver<Dependency1, KernelType> dep) {
        return (Axon<KernelType> axon, KernelType kernel) -> process(axon, dep.resolve(kernel));
    }
}
