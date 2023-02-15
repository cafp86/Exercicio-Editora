package tech.ada.aula.editora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.ada.aula.editora.model.entity.EditoraEntity;

@Repository
public interface EditoraRepository extends JpaRepository<EditoraEntity, Long> {

}
