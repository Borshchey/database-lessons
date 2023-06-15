package hw.db1;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;

@Getter

@Entity
@Table(name = "climbers")
public class Climber extends Unique{
    @Column(name = "fullName", nullable = false)
    private String fullName;
    @Column(name = "address", nullable = false)
    private String address;

    @ManyToMany(mappedBy = "clibmbers")
    @JoinColumn
    private ArrayList<Group> groups;

    public Climber(String fullName, String address) {
        this.fullName = fullName;
        this.address = address;
    }
}
