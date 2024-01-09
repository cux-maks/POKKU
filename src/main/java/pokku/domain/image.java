package pokku.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "image")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class image {

    @Id
    @Column(name = "image_name")
    private String image_name;

    @Column(name = "image_url")
    private String image_url;

}
