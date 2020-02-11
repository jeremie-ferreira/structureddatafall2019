package fr.epita.structureddata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.epita.structureddata.entity.Quizz;

public interface QuizzRepository extends JpaRepository<Quizz, Long> {
	
}
