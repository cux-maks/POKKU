package pokku.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "skills_versioncontrol")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SkillsVersioncontrol {

    @Id
    @Column(name = "skills_versioncontrol_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long SkillsVersioncontrolId;

    @Column(name = "skill_name")
    private String SkillName;

    @OneToMany(mappedBy = "skillsVersioncontrolId", cascade = CascadeType.ALL)
    private List<UserPortfolioSkillsVersioncontrol> userPortfolioSkillsVersioncontrolList = new ArrayList<>();

}
