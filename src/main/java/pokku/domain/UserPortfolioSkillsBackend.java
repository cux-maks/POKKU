package pokku.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_portfolio_skills_backend")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserPortfolioSkillsBackend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_portfolio_skills_backend_id")
    private Long UserPortfolioSkillsBackendId;



    @ManyToOne
    @JoinColumn(name = "skills_backend_id", referencedColumnName = "skills_backend_id")
    private SkillsBackend skillsBackendId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private UserInfo userInfo;
}
