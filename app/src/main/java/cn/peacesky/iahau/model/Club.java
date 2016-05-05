package cn.peacesky.iahau.model;

/**
 * Created by hc on 16-4-28.
 */
public class Club {
    private String name;
    private int imageId;

    public Club(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }


}
