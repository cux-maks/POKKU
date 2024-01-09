package pokku.dao;

import pokku.domain.SkillsBackend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsBackendRepository extends JpaRepository<SkillsBackend, Long> {
}
