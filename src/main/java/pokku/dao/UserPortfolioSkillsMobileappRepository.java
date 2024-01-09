package pokku.dao;

import pokku.domain.UserPortfolioSkillsMobileapp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPortfolioSkillsMobileappRepository extends JpaRepository<UserPortfolioSkillsMobileapp, Long> {
}
