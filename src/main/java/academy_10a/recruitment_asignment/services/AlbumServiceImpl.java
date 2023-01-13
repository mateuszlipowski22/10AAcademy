package academy_10a.recruitment_asignment.services;

import academy_10a.recruitment_asignment.models.Album;
import academy_10a.recruitment_asignment.repositories.AlbumRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AlbumServiceImpl implements AlbumService{

    private final AlbumRepository albumRepository;


    @Override
    public Album findAlbumByID(Long ID) {
        return albumRepository.findById(ID).get();
    }
}
