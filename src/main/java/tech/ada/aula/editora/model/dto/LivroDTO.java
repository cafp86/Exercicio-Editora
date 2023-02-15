package tech.ada.aula.editora.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LivroDTO {
	private Long id;
	private Long editora_id;
	private Long categoria_id;
	private String nome;
	private String isbn;
}
