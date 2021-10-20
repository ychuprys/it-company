package by.chuprys.itcompany.domain;

public class OfficeManager<C extends Cleaning<C, O>, O extends OfficeManager<C, O>> extends Worker<C, O> {

    public OfficeManager(String id, String firstName, boolean isWork, boolean uniform) {
        super(id, firstName, isWork, uniform);
    }

    @Override
    public String toString() {
        return "OfficeManager: " + getFirstName();
    }

}
