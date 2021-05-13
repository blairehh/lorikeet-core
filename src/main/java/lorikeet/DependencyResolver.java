package lorikeet;

public interface DependencyResolver<DependencyType, SystemType> {
    DependencyType resolve(SystemType system);
}
