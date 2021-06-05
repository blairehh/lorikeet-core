package lorikeet.signals.http;

import lorikeet.Axon;

public interface HTTPEndpointReceptor<KernelType> {
    void handle(Axon<KernelType> axon);
}
