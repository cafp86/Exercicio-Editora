package tech.ada.aula.editora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.ada.aula.editora.model.entity.LivroEntity;

@Repository
public interface LivroRepository extends JpaRepository<LivroEntity, Long> {

}
