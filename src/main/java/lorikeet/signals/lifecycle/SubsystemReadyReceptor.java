package lorikeet.signals.lifecycle;

import lorikeet.Axon;

public interface SubsystemReadyReceptor<SystemType> {
    void onReady(Axon<SystemType> axon);
}
