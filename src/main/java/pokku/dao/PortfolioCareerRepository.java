package pokku.dao;

import pokku.domain.PortfolioCareer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortfolioCareerRepository extends JpaRepository<PortfolioCareer, Long> {
}
