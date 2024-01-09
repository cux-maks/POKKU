package pokku.dao;

import pokku.domain.UserPortfolioSkillsCertification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPortfolioSkillsCertificationRepository extends JpaRepository<UserPortfolioSkillsCertification, Long> {
}
