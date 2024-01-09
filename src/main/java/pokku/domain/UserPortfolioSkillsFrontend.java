package pokku.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_portfolio_skills_frontend")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserPortfolioSkillsFrontend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_portfolio_skills_frontend_id")
    private Long UserPortfolioSkillsFrontendId;

    @ManyToOne
    @JoinColumn(name = "skills_frontend_id", referencedColumnName = "skills_frontend_id")
    private SkillsDeployment skillsFrontendId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private UserInfo userInfo;
}
