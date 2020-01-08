
/* 
Low level classes depending on abstraction from higher level module.
Dependency inverted.
*/
public class UserDatabaseService implements UserService {
    public User findUser(String userId) {
        return new User();
    }   
}