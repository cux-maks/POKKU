package pokku.dao;

import pokku.domain.UserInfoBlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoBlogRepository extends JpaRepository <UserInfoBlog, String> {
}
