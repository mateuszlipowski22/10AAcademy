package academy_10a.recruitment_asignment.models;

import jakarta.persistence.*;

import java.sql.Time;

@Entity
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Basic
    private Time duration;
}
