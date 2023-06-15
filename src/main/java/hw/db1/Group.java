package hw.db1;

import jakarta.persistence.*;
import lombok.Getter;
import java.util.ArrayList;
import java.util.Date;

@Getter

@Entity
@Table(name = "groups")
public class Group extends Unique{
    @JoinColumn
    @ManyToMany(mappedBy = "climber", cascade = CascadeType.ALL)
    @JoinTable(name = "climber_id")
    private ArrayList<Climber> climbers;

    @Column(nullable = false)
    private boolean isOpen;
    @Id
    @ManyToOne
    @JoinColumn(name = "mountain_id", nullable = false)
    private Mountain mountain;
    @Column
    private Date startDate;
    @Column
    private Date endDate;

    public Group(Mountain mountain) {
        this.mountain = mountain;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
