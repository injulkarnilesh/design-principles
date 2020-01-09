package SOLID.DEPENDENCY_INVERSION.example.fix.higer_level_module;

/*
The magical abstraction.
*/
public interface UserService {
    User findUser(String userId);
}