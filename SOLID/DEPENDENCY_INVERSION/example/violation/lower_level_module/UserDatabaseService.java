package SOLID.DEPENDENCY_INVERSION.example.violation.lower_level_module;

/* 
Low level classes not dependending on any abstraction.
*/
public class UserDatabaseService {
    public User findUser(String userId) {
        return new User();
    }   
}