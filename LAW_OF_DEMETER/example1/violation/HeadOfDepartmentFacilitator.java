package LAW_OF_DEMETER.example1.violation;

import java.util.Objects;

public class HeadOfDepartmentFacilitator {

    /*
    Knows Address Class Details. Does not need to know that.
     */
    public boolean isEligibleForRentAllowense(Department department) {
        final Employee hod = department.getHeadOfDepartment();
        final Address currentAddress = hod.getCurrentAddress();
        final Address permanentAddress = hod.getPermanentAddress();
        return Objects.equals(currentAddress.getCity(), permanentAddress.getCity());
    }

}
