package academy_10a.recruitment_asignment.dto;


import lombok.*;

import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TrackDTO {

    private Long id;

    private String title;

    private LocalTime duration;

}
