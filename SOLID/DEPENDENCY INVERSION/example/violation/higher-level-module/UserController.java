
/*
Higher level classes depending on lower level classes directly.
Imaging this is the case at multiple places, and you need to 
    * Use something else instead of UserDatabaseService
    * The way UserDatabaseService is instantiated changes
    * UserDatabaseService changes contract
Systems are coupled very tightly here.
*/
public class UserController {

    private UserDatabaseService userService = new UserDatabaseService();

    public User getUser(String userId) {
        return this.userService.findUser(userId);
    }

}