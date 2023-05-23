package kz.bitlab.sprint2.sprint2.repository;

import kz.bitlab.sprint2.sprint2.Modals.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends JpaRepository<Courses,Long> {
}
