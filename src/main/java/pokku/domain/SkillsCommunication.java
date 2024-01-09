package pokku.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "skills_communication")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SkillsCommunication {

    @Id
    @Column(name = "skills_communication_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long SkillsCommunicationId;

    @Column(name = "skill_name")
    private String SkillName;

    @OneToMany(mappedBy = "skillsCommunicationId", cascade = CascadeType.ALL)
    private List<UserPortfolioSkillsCommunication> userPortfolioSkillsCommunicationList = new ArrayList<>();

}
