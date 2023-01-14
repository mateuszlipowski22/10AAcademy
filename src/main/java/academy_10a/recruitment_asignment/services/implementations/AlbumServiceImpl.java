package academy_10a.recruitment_asignment.services.implementations;

import academy_10a.recruitment_asignment.dto.AlbumDTO;
import academy_10a.recruitment_asignment.models.Album;
import academy_10a.recruitment_asignment.repositories.AlbumRepository;
import academy_10a.recruitment_asignment.services.interfaces.AlbumService;
import academy_10a.recruitment_asignment.services.interfaces.TrackService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AlbumServiceImpl implements AlbumService {

    private final AlbumRepository albumRepository;
    private final TrackService trackService;

    @Override
    public Album findAlbumByID(Long ID) {
        return albumRepository.findById(ID).orElseThrow();
    }

    @Override
    public AlbumDTO findAlbumDTOByID(Long ID) {
        return convertAlbumIntoAlbumDTOWithDuration(findAlbumByID(ID));
    }

    @Override
    public List<AlbumDTO> findAllAlbumDTO() {
        return findAll()
                .stream()
                .map(this::convertAlbumIntoAlbumDTOWithoutTracks)
                .collect(Collectors.toList());
    }

    @Override
    public List<Album> findAll() {
        return albumRepository.findAll();
    }

    @Override
    public AlbumDTO convertAlbumIntoAlbumDTOWithoutTracks(Album album) {
        AlbumDTO albumDTO= new AlbumDTO(
                album.getId(),
                album.getPerformer(),
                album.getTitle(),
                album.getReleaseDate(),
                null);
        albumDTO.setAlbumDuration(getAlbumDuration(album));
        return albumDTO;
    }

    @Override
    public AlbumDTO convertAlbumIntoAlbumDTO(Album album) {
        return new AlbumDTO(
                album.getId(),
                album.getPerformer(),
                album.getTitle(),
                album.getReleaseDate(),
                album.getTracks().stream().map(trackService::convertTrackIntoTrackDTO).collect(Collectors.toList())
        );
    }

    @Override
    public AlbumDTO convertAlbumIntoAlbumDTOWithDuration(Album album) {
        AlbumDTO albumDTO = convertAlbumIntoAlbumDTO(album);
        albumDTO.setAlbumDuration(getAlbumDuration(album));
        return albumDTO;
    }

    @Override
    public String getAlbumDuration(Album album){
        Duration duration = album.getTracks().stream()
                .map(track -> Duration.between(LocalTime.of(0   , 0, 0), track.getDuration()))
                .reduce(Duration.ZERO, Duration::plus);
        return String.format("%02d:%02d:%02d", duration.toHours(), duration.toMinutesPart(), duration.toSecondsPart());
    }
}
