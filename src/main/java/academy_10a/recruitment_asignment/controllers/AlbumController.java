package academy_10a.recruitment_asignment.controllers;

import academy_10a.recruitment_asignment.dto.AlbumDTO;
import academy_10a.recruitment_asignment.services.implementations.AlbumServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/albums/")
public class AlbumController {

    private final AlbumServiceImpl albumService;

    @GetMapping("{id}")
    public AlbumDTO getAlbum(@PathVariable Long id){
        return albumService.findAlbumDTOByID(id);
    }

    @GetMapping("")
    public List<AlbumDTO> getAlbum(){
        return albumService.findAllAlbumDTO();
    }
}
