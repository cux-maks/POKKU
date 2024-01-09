package pokku.dao;

import pokku.domain.SkillsFrontend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsFrontendRepository extends JpaRepository<SkillsFrontend, Long> {
}
