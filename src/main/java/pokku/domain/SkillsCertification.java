package pokku.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "skills_certification")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SkillsCertification {

    @Id
    @Column(name = "skills_certification_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long SkillsCertificationId;

    @Column(name = "skill_name")
    private String SkillName;

    @OneToMany(mappedBy = "skillsCertificationId", cascade = CascadeType.ALL)
    private List<UserPortfolioSkillsCertification> userPortfolioSkillsCertificationList = new ArrayList<>();

}
