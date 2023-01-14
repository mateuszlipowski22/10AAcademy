package academy_10a.recruitment_asignment.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class AlbumDTO {

    private Long id;

    private String performer;

    private String title;

    private Date releaseDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<TrackDTO> tracks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String albumDuration=null;

    public AlbumDTO(Long id, String performer, String title, Date releaseDate, List<TrackDTO> tracks) {
        this.id = id;
        this.performer = performer;
        this.title = title;
        this.releaseDate = releaseDate;
        this.tracks = tracks;
    }
}
