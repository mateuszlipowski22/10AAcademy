package academy_10a.recruitment_asignment.controllers;

import academy_10a.recruitment_asignment.models.Album;
import academy_10a.recruitment_asignment.services.AlbumServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/album/")
public class AlbumController {

    private final AlbumServiceImpl albumService;

    @GetMapping("{id}")
    public Album getAlbum(@PathVariable Long id){
        return albumService.findAlbumByID(id);
    }

}
