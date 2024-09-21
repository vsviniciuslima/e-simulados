package br.usp.esimulados.model.questions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionAlternative implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private List<String> imageUrls;
    private String content;
    private boolean correct;

    private UUID uuid = UUID.randomUUID();
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();
}