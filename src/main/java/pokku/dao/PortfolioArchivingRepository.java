package pokku.dao;

import pokku.domain.PortfolioArchiving;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortfolioArchivingRepository extends JpaRepository<PortfolioArchiving, Long> {
}
