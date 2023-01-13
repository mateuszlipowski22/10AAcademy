package academy_10a.recruitment_asignment.repositories;

import academy_10a.recruitment_asignment.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
