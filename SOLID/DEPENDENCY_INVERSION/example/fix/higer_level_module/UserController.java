package SOLID.DEPENDENCY_INVERSION.example.fix.higer_level_module;

/*
Higher level class depending on abstraction that it defined in higher level module itself.
Now replacing userservice implementation is as easy as passing correct implementation to contructor.
As UserService abstraction is defined by this module, it depends on abstraction defined by itself.
This class does not depend on any particular implementation of absraction that is UserService.
*/
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public User getUser(String userId) {
        return this.userService.findUser(userId);
    }

}