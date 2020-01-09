package SOLID.DEPENDENCY_INVERSION.example.fix.lower_level_module;

import SOLID.DEPENDENCY_INVERSION.example.fix.higer_level_module.User;
import SOLID.DEPENDENCY_INVERSION.example.fix.higer_level_module.UserService;

/*
Low level classes depending on abstraction from higher level module.
Dependency inverted.
*/
public class UserDatabaseService implements UserService {
    public User findUser(String userId) {
        return new User();
    }   
}