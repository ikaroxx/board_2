package kwg.board.dto;

import lombok.*;

import java.time.LocalDateTime;

//DTO(Data Transfer Object), VO, Bean
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class BoardDTO {
    private Long id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
    private int boardHits;
    private LocalDateTime boardCreatedTime;
    private LocalDateTime boardUpdatedTime;

}
