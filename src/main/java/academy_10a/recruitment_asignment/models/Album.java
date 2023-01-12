package academy_10a.recruitment_asignment.models;

import jakarta.persistence.*;

import javax.sound.midi.Track;
import java.sql.Date;
import java.util.ArrayList;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String performer;

    private String title;

    @Basic
    private Date releaseDate;

    @ManyToMany
    private ArrayList<Track> tracks;
}
