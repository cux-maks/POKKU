package pokku.dao;

import pokku.domain.UserInfoGithub;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoGithubRepository extends JpaRepository<UserInfoGithub, String> {
}
