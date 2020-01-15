package PRIMITIVE_OBSESSION.example2.fix;

public class ProfilePicture {
    private Url url;
    private ImageDimension dimension;

    public String hostedAt() {
        return this.url.getBaseUrl();
    }

    public boolean fitsInto(ImageDimension dimension) {
        return this.dimension.fitsInto(dimension);
    }
}
