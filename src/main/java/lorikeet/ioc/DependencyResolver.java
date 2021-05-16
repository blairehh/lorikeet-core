package lorikeet.ioc;

public interface DependencyResolver<DependencyType, KernelType> {
    DependencyType resolve(KernelType system);
}
