package tech.ada.aula.editora.service;

import java.util.List;

import tech.ada.aula.editora.model.dto.EditoraDTO;

public interface BaseService<T> {
	List<T> buscarTodos();
	T buscarUm(Long id);
	T criar(EditoraDTO editoraDTO);
	T editar(Long id, T t);
	void excluir(Long id);
}
