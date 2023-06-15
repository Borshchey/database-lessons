package hw.db1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter

@Entity
@Table(name = "mountains")
public class Mountain extends Unique {
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "country", nullable = false)
    private String country;
    @Column(name = "high", nullable = false)
    private int high;

    public Mountain(String title, String country, int high) {
        this.title = title;
        this.country = country;
        this.high = high;
    }
}
