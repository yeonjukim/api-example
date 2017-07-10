package god.yeonju;

/**
 * Created by kakao on 2017. 7. 10..
 */
public class Restaurant {
    private long id;
    private String name; //업소명
    private double latitude; //위도
    private double longitude; //경도

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
