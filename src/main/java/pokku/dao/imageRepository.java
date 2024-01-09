package pokku.dao;

import pokku.domain.image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface imageRepository extends JpaRepository<image, String> {
}
