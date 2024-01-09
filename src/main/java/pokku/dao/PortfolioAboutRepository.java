package pokku.dao;

import pokku.domain.PortfolioAbout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortfolioAboutRepository extends JpaRepository<PortfolioAbout, Long> {
}
