package academy_10a.recruitment_asignment.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String performer;

    private String title;

    @Basic
    private Date releaseDate;

    @ManyToMany
    private List<Track> tracks;
}
