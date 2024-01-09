package pokku.dao;

import pokku.domain.SkillsCommunication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsCommunicationRepository extends JpaRepository<SkillsCommunication, Long> {
}
