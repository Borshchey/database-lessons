package hw.db1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter

@Entity
@Table(name = "mountains")
public class Mountain extends Unique {
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String country;
    @Column(nullable = false)
    private int high;

    public Mountain(String title, String country, int high) {
        this.title = title;
        this.country = country;
        this.high = high;
    }

    public Mountain() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }
}
