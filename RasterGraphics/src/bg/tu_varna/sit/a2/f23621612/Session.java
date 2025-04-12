package bg.tu_varna.sit.a2.f23621612;

import java.util.*;


class Session {
    private int id;
    private List<String> images;

    public Session(int id) {
        this.id = id;
        this.images = new ArrayList<>();
    }

    public void addImage(String imageName) {
        images.add(imageName);
    }

    public int getId() {
        return id;
    }

    public List<String> getImages() {
        return images;
    }
}
