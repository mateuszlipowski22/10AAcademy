package academy_10a.recruitment_asignment.services.implementations;

import academy_10a.recruitment_asignment.dto.TrackDTO;
import academy_10a.recruitment_asignment.models.Track;
import academy_10a.recruitment_asignment.services.interfaces.TrackService;
import org.springframework.stereotype.Service;

@Service
public class TrackServiceImpl implements TrackService {

    @Override
    public TrackDTO convertTrackIntoTrackDTO(Track track) {
        return TrackDTO.builder()
                .id(track.getId())
                .title(track.getTitle())
                .duration(track.getDuration())
                .build();
    }
}
