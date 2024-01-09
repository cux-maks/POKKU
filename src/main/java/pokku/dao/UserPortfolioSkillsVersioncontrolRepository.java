package pokku.dao;

import pokku.domain.UserPortfolioSkillsVersioncontrol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPortfolioSkillsVersioncontrolRepository extends JpaRepository<UserPortfolioSkillsVersioncontrol, Long> {
}
