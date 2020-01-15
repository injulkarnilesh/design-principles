package PRIMITIVE_OBSESSION.example1.fix;

public interface PostService {
    /*
    Implementation of this interface does not care about
        validation or representation of Zip
     */
    boolean isActiveAt(ZipCode zipCode);
    void startNewAt(ZipCode zipCode);
}
