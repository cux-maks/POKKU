package pokku.dao;

import pokku.domain.PortfolioProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortfolioProjectRepository extends JpaRepository<PortfolioProject, Long> {
}
