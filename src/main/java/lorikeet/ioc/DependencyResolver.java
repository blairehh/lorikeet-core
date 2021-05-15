package lorikeet.ioc;

public interface DependencyResolver<DependencyType, SystemType> {
    DependencyType resolve(SystemType system);
}
