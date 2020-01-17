package CODE_SMELLS.PRIMITIVE_OBSESSION.example2.violation;

public class ProfilePicture {
    private String url;
    private int width;
    private int height;

    public String getUrl() {
        return url;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String hostedAt() {
        /*
        Parse URL to get base url of hosted server.
         */
        return null;
    }

    public boolean fitsInto(int width, int height) {
        /*
        Dimension logic in this class.
         */
        return width >= this.width && height >= this.height;
    }
}
