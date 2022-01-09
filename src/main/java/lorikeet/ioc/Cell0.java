package lorikeet.ioc;

import lorikeet.Axon;

public interface Cell0<ReturnType, KernelType> {
    ReturnType process(Axon<KernelType> axon);

    default WiredCell<ReturnType, KernelType> requires() {
        return (Axon<KernelType> axon, KernelType system) -> process(axon);
    }
}
