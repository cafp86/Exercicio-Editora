package tech.ada.aula.editora.model.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import tech.ada.aula.editora.model.dto.EditoraDTO;
import tech.ada.aula.editora.model.entity.EditoraEntity;

@Component
public class EditoraMapper {

	public EditoraDTO parseDTO(List<EditoraEntity> editoras) {
		return editoras.stream()
			.map(editora->parseDTO(editora))
			.toList();
	}
}
