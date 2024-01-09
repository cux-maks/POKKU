package pokku.dao;

import pokku.domain.SkillsDeployment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsDeploymentRepository extends JpaRepository<SkillsDeployment, Long> {
}
