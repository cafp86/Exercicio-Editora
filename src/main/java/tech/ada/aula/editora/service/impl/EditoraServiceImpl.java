package tech.ada.aula.editora.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.ada.aula.editora.model.dto.EditoraDTO;
import tech.ada.aula.editora.repository.EditoraRepository;
import tech.ada.aula.editora.service.EditoraService;

@Service
public class EditoraServiceImpl implements EditoraService<EditoraDTO> {

	@Autowired
	private EditoraRepository repository;
	
	public List<EditoraDTO> buscarTodos() {
		return repository.findAll();
	}

	public EditoraDTO buscarUm(Long id) {
		return null;
	}
	
	public EditoraDTO criar(EditoraDTO editoraDTO) {
		return null;
	}

	public EditoraDTO editar(Long id, EditoraDTO editoraDTO) {
		return null;
	}

	public void excluir(Long id) {
		
	}

}
