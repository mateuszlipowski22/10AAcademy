package academy_10a.recruitment_asignment.controllers;

import academy_10a.recruitment_asignment.dto.TrackDTO;
import academy_10a.recruitment_asignment.services.interfaces.TrackService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/albums/{albumID}/tracks")
public class TrackController {

    private final TrackService trackService;

    @GetMapping("")
    public List<TrackDTO>getTracks(@PathVariable Long albumID){
        return trackService.findAllTrackDTOByAlbumID(albumID);
    }

}
