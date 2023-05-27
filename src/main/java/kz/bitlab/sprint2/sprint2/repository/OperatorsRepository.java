package kz.bitlab.sprint2.sprint2.repository;

import kz.bitlab.sprint2.sprint2.Modals.Operators;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperatorsRepository extends JpaRepository<Operators,Long> {
}
