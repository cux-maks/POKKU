package pokku.dao;

import pokku.domain.SkillsMobileapp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsMobileappRepository extends JpaRepository<SkillsMobileapp, Long> {
}
