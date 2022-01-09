package lorikeet.signals.lifecycle;

import lorikeet.Axon;

public interface SubSystemReadyReceptor<KernelType> {
    void onReady(Axon<KernelType> axon);
}
