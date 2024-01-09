package pokku.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "skills_deployment")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SkillsDeployment {

    @Id
    @Column(name = "skills_delployment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long SkillsDeploymentId;

    @Column(name = "skill_name")
    private String SkillName;

    @OneToMany(mappedBy = "skillsDeploymentId", cascade = CascadeType.ALL)
    private List<UserPortfolioSkillsDeployment> userPortfolioSkillsDeploymentList = new ArrayList<>();

}
