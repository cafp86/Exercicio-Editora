package tech.ada.aula.editora.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="livro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LivroEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="editora_id")
	private Long editora_id;
	
	@Column(name="categoria_id")
	private Long categoria_id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="isbn", length=13)
	private String isbn;
}
