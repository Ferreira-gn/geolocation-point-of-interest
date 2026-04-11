package geolocation.poi.controller;

import geolocation.poi.dto.request.CreatePoiDTO;
import geolocation.poi.entity.PointOfInterestEntity;
import geolocation.poi.repository.PointOfInterestRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/point-of-interest")
@RequiredArgsConstructor
public class PointOfInterestController {

  private final PointOfInterestRepository repository;

  @PostMapping("/")
  public ResponseEntity<PointOfInterestEntity> createPoi(
    @RequestBody @Valid CreatePoiDTO dto
  ) {
    PointOfInterestEntity newPoi = new PointOfInterestEntity(dto);
    repository.save(newPoi);
    return ResponseEntity.ok(newPoi);
  }
}
