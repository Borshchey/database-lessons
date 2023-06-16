package hw.db1;

import jakarta.persistence.*;
import lombok.Getter;

import java.sql.Time;
import java.util.ArrayList;

@Getter

@Entity
@Table(name = "groups")
public class Group extends Unique{
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "groups_climbers")
    private ArrayList<Climber> climbers = new ArrayList<>();

    @Column(nullable = false)
    private boolean isOpen = true;
    @ManyToOne
    @JoinColumn(name = "mountain_id", nullable = false)
    private Mountain mountain;
    private Time startDate;
    private Time endDate;

    public Group(Mountain mountain) {
        this.mountain = mountain;
    }

    public Group(){}

    public ArrayList<Climber> getClimbers() {
        return climbers;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public Mountain getMountain() {
        return mountain;
    }

    public Time getStartDate() {
        return startDate;
    }

    public Time getEndDate() {
        return endDate;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public void setStartDate(Time startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Time endDate) {
        this.endDate = endDate;
    }
}
