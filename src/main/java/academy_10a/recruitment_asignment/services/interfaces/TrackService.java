package academy_10a.recruitment_asignment.services.interfaces;

import academy_10a.recruitment_asignment.dto.TrackDTO;
import academy_10a.recruitment_asignment.models.Track;

public interface TrackService {

    TrackDTO convertTrackIntoTrackDTO(Track track);


}
