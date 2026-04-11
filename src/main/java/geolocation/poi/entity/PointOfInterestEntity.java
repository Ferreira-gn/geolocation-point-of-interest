package geolocation.poi.entity;

import geolocation.poi.dto.request.CreatePoiDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "point_of_interest")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PointOfInterestEntity {

  public PointOfInterestEntity(CreatePoiDTO dto) {
    this.name = dto.name();
    this.latitude = dto.latitude();
    this.longitude = dto.longitude();
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long id;

  @Column(nullable = false, length = 255)
  public String name;

  @Column(nullable = false)
  public Long latitude;

  @Column(nullable = false)
  public Long longitude;
}
