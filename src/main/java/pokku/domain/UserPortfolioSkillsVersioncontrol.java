package pokku.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_portfolio_skills_versioncontrol")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserPortfolioSkillsVersioncontrol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_portfolio_skills_versioncontrol_id")
    private Long UserPortfolioSkillsVersioncontrolId;

    @ManyToOne
    @JoinColumn(name = "skills_versioncontrol_id", referencedColumnName = "skills_versioncontrol_id")
    private SkillsDeployment skillsVersioncontrolId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private UserInfo userInfo;
}
