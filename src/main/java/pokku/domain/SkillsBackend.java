package pokku.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "skills_backend")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SkillsBackend {

    @Id
    @Column(name = "skills_backend_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long SkillsBackendId;

    @Column(name = "skill_name")
    private String SkillName;

    @OneToMany(mappedBy = "skillsBackendId", cascade = CascadeType.ALL)
    private List<UserPortfolioSkillsBackend> userPortfolioSkillsBackendList = new ArrayList<>();

}
