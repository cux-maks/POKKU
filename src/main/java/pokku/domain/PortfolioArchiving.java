package pokku.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "portfolio_archiving")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PortfolioArchiving {

    @Id
    @Column(name = "portfolio_archiving_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PortfolioArchivingId;

    @Column(name = "archiving_name")
    private String ArchivingName;

    @Column(name = "archiving_explanation")
    private String ArchivingExplanation;

}
