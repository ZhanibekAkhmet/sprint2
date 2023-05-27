package kz.bitlab.sprint2.sprint2.repository;

import jakarta.transaction.Transactional;
import kz.bitlab.sprint2.sprint2.Modals.Applications;
import kz.bitlab.sprint2.sprint2.Modals.Operators;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.beans.Transient;
import java.util.List;

@Repository
@Transactional
public interface ApplicationRepository extends JpaRepository<Applications,Long> {
    List<Applications>findAllByHandled(boolean handled);
}
