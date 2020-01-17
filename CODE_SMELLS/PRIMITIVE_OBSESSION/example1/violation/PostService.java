package CODE_SMELLS.PRIMITIVE_OBSESSION.example1.violation;

public interface PostService {
    /*
    Should implementation of this interface be validating zipCode?
     */
    boolean isActiveAt(String zipCode);
    void startNewAt(String zipCode);
}
