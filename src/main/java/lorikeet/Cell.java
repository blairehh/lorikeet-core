package lorikeet;

import lorikeet.ioc.WiredCell;

public interface Cell<ReturnType, SystemType> {
    WiredCell<ReturnType, SystemType> junction();
}
