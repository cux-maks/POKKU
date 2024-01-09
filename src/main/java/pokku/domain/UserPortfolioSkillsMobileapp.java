package pokku.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_portfolio_skills_mobileapp")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserPortfolioSkillsMobileapp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_portfolio_skills_mobileapp_id")
    private Long UserPortfolioSkillsMobileappId;

    @ManyToOne
    @JoinColumn(name = "skills_mobileapp_id", referencedColumnName = "skills_mobileapp_id")
    private SkillsDeployment skillsMobileappId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private UserInfo userInfo;
}
