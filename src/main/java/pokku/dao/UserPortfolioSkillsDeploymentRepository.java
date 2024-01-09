package pokku.dao;

import pokku.domain.UserPortfolioSkillsDeployment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPortfolioSkillsDeploymentRepository extends JpaRepository<UserPortfolioSkillsDeployment, Long> {
}
