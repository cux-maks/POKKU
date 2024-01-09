package pokku.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "skills_frontend")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SkillsFrontend {

    @Id
    @Column(name = "skills_frontend_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long SkillsFrontendId;

    @Column(name = "skill_name")
    private String SkillName;

    @OneToMany(mappedBy = "skillsFrontendId", cascade = CascadeType.ALL)
    private List<UserPortfolioSkillsFrontend> userPortfolioSkillsFrontendList = new ArrayList<>();

}
