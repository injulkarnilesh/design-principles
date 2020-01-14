package LAW_OF_DEMETER.example1.fix;

public class HeadOfDepartmentFacilitator {

    public boolean isEligibleForRentAllowense(Department department) {
        final Employee hod = department.getHeadOfDepartment();
        return hod.staysInSameCity();
    }

}
