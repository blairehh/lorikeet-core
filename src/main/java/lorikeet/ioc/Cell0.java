package lorikeet.ioc;

import lorikeet.Axon;

public interface Cell0<ReturnType, SystemType> {
    ReturnType process(Axon<SystemType> axon);

    default WiredCell<ReturnType, SystemType> requires() {
        return (Axon<SystemType> axon, SystemType system) -> process(axon);
    }
}
