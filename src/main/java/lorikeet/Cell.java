package lorikeet;

import lorikeet.ioc.WiredCell;

public interface Cell<ReturnType, KernelType> {
    WiredCell<ReturnType, KernelType> junction();
}
