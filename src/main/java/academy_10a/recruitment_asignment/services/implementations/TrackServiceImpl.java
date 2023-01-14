package academy_10a.recruitment_asignment.services.implementations;

import academy_10a.recruitment_asignment.dto.TrackDTO;
import academy_10a.recruitment_asignment.models.Track;
import academy_10a.recruitment_asignment.repositories.TrackRepository;
import academy_10a.recruitment_asignment.services.interfaces.TrackService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TrackServiceImpl implements TrackService {

    private final TrackRepository trackRepository;

    @Override
    public TrackDTO convertTrackIntoTrackDTO(Track track) {
        return TrackDTO.builder()
                .id(track.getId())
                .title(track.getTitle())
                .duration(track.getDuration())
                .build();
    }

    @Override
    public List<Track> findAllByAlbumID(Long ID) {
        return trackRepository.findAllByAlbumID(ID);
    }
}
