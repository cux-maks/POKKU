package pokku.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "portfolio_about")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PortfolioAbout {

    @Id
    @Column(name = "portfolio_about_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PortfolioAboutId;

    @Column(name = "user_name_visible")
    private boolean UserNameVisible;

    @Column(name = "user_tel_visible")
    private boolean UserTelVisible;

    @Column(name = "user_email_visible")
    private boolean UserEmailVisible;

    @Column(name = "user_education_visible")
    private boolean UserEducationVisible;

}
