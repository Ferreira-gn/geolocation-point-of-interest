package geolocation.poi.controller;

import geolocation.poi.dto.request.CreatePoiDTO;
import geolocation.poi.entity.PointOfInterestEntity;
import geolocation.poi.repository.PointOfInterestRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.*;
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

  @GetMapping("/")
  public ResponseEntity<Page<PointOfInterestEntity>> listAllPoi(
    @RequestParam(name = "page", defaultValue = "0") Integer page,
    @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize
  ) {
    var paginatedPOI = repository.findAll(PageRequest.of(page, pageSize));
    return ResponseEntity.ok(paginatedPOI);
  }
}
