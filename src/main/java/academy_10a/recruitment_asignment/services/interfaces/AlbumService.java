package academy_10a.recruitment_asignment.services.interfaces;

import academy_10a.recruitment_asignment.dto.AlbumDTO;
import academy_10a.recruitment_asignment.models.Album;

import java.util.List;

public interface AlbumService {

    Album findAlbumByID(Long ID);

    AlbumDTO findAlbumDTOByID(Long ID);

    List<Album> findAll();

    List<AlbumDTO> findAllAlbumDTO();

    AlbumDTO convertAlbumIntoAlbumDTO(Album album);

    AlbumDTO convertAlbumIntoAlbumDTOWithoutTracksWithDuration(Album album);

    AlbumDTO convertAlbumIntoAlbumDTOWithTracksWithoutDuration(Album album);

    String getAlbumDuration(Album album);
}
