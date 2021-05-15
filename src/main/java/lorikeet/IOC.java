package lorikeet;

import lorikeet.ioc.Cell0;
import lorikeet.ioc.Cell1;
import lorikeet.ioc.Cell2;
import lorikeet.ioc.Cell3;

public class IOC {
    public static <ReturnType, SystemType> Cell0<ReturnType, SystemType> cell(
        Cell0<ReturnType, SystemType> cell
    ) {
        return cell;
    }

    public static <ReturnType, Dependency1, SystemType> Cell1<ReturnType, Dependency1, SystemType> cell(
        Cell1<ReturnType, Dependency1, SystemType> cell
    ) {
        return cell;
    }

    public static <ReturnType, Dependency1, Dependency2, SystemType> Cell2<ReturnType, Dependency1, Dependency2, SystemType> cell(
        Cell2<ReturnType, Dependency1, Dependency2, SystemType> cell
    ) {
        return cell;
    }
    public static <ReturnType, Dependency1, Dependency2, Dependency3, SystemType> Cell3<ReturnType, Dependency1, Dependency2, Dependency3, SystemType> cell(
        Cell3<ReturnType, Dependency1, Dependency2, Dependency3, SystemType> cell
    ) {
        return cell;
    }

}
