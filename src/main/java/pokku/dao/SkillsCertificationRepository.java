package pokku.dao;

import pokku.domain.SkillsCertification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsCertificationRepository extends JpaRepository<SkillsCertification, Long> {
}
