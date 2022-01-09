package lorikeet.ioc;

import lorikeet.Axon;

public interface WiredCell<ReturnType, KernelType> {
    ReturnType invoke(Axon<KernelType> axon, KernelType system);
}
