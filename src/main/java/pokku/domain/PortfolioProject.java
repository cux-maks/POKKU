package pokku.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "portfolio_project")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PortfolioProject {

    @Id
    @Column(name = "portfolio_project_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PortfolioArchivingId;

    @Column(name = "project_name")
    private String ArchivingName;

    @Column(name = "project_explanation")
    private String ArchivingExplanation;

}
