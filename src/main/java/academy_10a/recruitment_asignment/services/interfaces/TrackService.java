package academy_10a.recruitment_asignment.services.interfaces;

import academy_10a.recruitment_asignment.dto.TrackDTO;
import academy_10a.recruitment_asignment.models.Track;

import java.util.List;

public interface TrackService {

    TrackDTO convertTrackIntoTrackDTO(Track track);

    List<Track> findAllByAlbumID(Long ID);
}
