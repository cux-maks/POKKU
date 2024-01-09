package pokku.dao;

import pokku.domain.UserInfoInstagram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoInstagramRepository extends JpaRepository<UserInfoInstagram, String> {
}
