package lorikeet.ioc;

import lorikeet.Axon;

public interface WiredCell<ReturnType, SystemType> {
    ReturnType invoke(Axon<SystemType> axon, SystemType system);
}
