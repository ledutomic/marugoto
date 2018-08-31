package ch.uzh.marugoto.core.data.repository;

import java.util.List;

import com.arangodb.springframework.repository.ArangoRepository;

import ch.uzh.marugoto.core.data.entity.ExerciseState;

public interface ExerciseStateRepository extends ArangoRepository<ExerciseState> {

	List<ExerciseState> findByPageState(String pageStateId);
}