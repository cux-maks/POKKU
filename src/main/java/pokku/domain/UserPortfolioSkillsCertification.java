package pokku.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_portfolio_skills_certification")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserPortfolioSkillsCertification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_portfolio_skills_certification_id")
    private Long UserPortfolioSkillsCertificationId;

    @ManyToOne
    @JoinColumn(name = "skills_certification_id", referencedColumnName = "skills_certification_id")
    private SkillsCertification skillsCertificationId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private UserInfo userInfo;
}
