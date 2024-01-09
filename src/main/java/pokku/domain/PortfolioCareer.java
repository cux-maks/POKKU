package pokku.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "portfolio_career")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PortfolioCareer {
    @Id
    @Column(name = "portfolio_career_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PortfolioCareerId;

    @Column(name = "career_explanation")
    private String CareerExplanation;

}
