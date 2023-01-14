package academy_10a.recruitment_asignment.repositories;

import academy_10a.recruitment_asignment.models.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TrackRepository extends JpaRepository<Track, Long> {

    @Query(value = "SELECT * FROM ALBUM_TRACKS INNER JOIN TRACK ON TRACK.ID=ALBUM_TRACKS.TRACKS_ID WHERE ALBUM_ID=:albumID ORDER BY TITLE", nativeQuery = true)
    List<Track> findAllByAlbumID(@Param("albumID")Long albumID);
}
