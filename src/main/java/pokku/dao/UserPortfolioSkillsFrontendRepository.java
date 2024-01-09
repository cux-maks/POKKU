package pokku.dao;

import pokku.domain.UserPortfolioSkillsFrontend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPortfolioSkillsFrontendRepository extends JpaRepository<UserPortfolioSkillsFrontend, Long> {
}
