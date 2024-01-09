package pokku.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_portfolio_skills_deployment")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserPortfolioSkillsDeployment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_portfolio_skills_deployment_id")
    private Long UserPortfolioSkillsDeploymentId;

    @ManyToOne
    @JoinColumn(name = "skills_deployment_id", referencedColumnName = "skills_deployment_id")
    private SkillsDeployment skillsDeploymentId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private UserInfo userInfo;
}
