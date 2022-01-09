package lorikeet;

import lorikeet.ioc.Cell0;
import lorikeet.ioc.Cell1;
import lorikeet.ioc.Cell2;
import lorikeet.ioc.Cell3;

public class IOC {
    public static <ReturnType, KernelType> Cell0<ReturnType, KernelType> cell(
        Cell0<ReturnType, KernelType> cell
    ) {
        return cell;
    }

    public static <ReturnType, Dependency1, KernelType> Cell1<ReturnType, Dependency1, KernelType> cell(
        Cell1<ReturnType, Dependency1, KernelType> cell
    ) {
        return cell;
    }

    public static <ReturnType, Dependency1, Dependency2, KernelType> Cell2<ReturnType, Dependency1, Dependency2, KernelType> cell(
        Cell2<ReturnType, Dependency1, Dependency2, KernelType> cell
    ) {
        return cell;
    }
    public static <ReturnType, Dependency1, Dependency2, Dependency3, KernelType> Cell3<ReturnType, Dependency1, Dependency2, Dependency3, KernelType> cell(
        Cell3<ReturnType, Dependency1, Dependency2, Dependency3, KernelType> cell
    ) {
        return cell;
    }

}
