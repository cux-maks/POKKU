package pokku.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "skills_mobileapp")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SkillsMobileapp {

    @Id
    @Column(name = "skills_mobileapp_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long SkillsMobileappId;

    @Column(name = "skill_name")
    private String SkillName;

    @OneToMany(mappedBy = "skillsMobileappId", cascade = CascadeType.ALL)
    private List<UserPortfolioSkillsMobileapp> userPortfolioSkillsMobileappList = new ArrayList<>();

}
