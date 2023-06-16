package hw.db1;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;

@Getter

@Entity
@Table(name = "climbers")
public class Climber extends Unique{
    @Column(nullable = false)
    private String fullName;
    @Column(nullable = false)
    private String address;

    @ManyToMany(mappedBy = "clibmbers")
    private ArrayList<Group> groups = new ArrayList<>();

    public Climber(String fullName, String address) {
        this.fullName = fullName;
        this.address = address;
    }

    public Climber(){}

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }
}
