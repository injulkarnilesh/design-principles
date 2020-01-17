package CODE_SMELLS.PRIMITIVE_OBSESSION.example2.fix;

public class ImageDimension {
    private int width;
    private int height;

    public boolean fitsInto(ImageDimension other) {
        return other.height >= this.height && other.width >= this.height;
    }
}
