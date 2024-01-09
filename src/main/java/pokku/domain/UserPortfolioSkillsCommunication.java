package pokku.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_portfolio_skills_communication")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserPortfolioSkillsCommunication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_portfolio_skills_communication_id")
    private Long UserPortfolioSkillsCommunicationId;

    @ManyToOne
    @JoinColumn(name = "skills_communication_id", referencedColumnName = "skills_communication_id")
    private SkillsCommunication skillsCommunication;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private UserInfo userInfo;
}
