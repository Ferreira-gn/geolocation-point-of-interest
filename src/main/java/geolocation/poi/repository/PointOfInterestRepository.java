package geolocation.poi.repository;

import geolocation.poi.entity.PointOfInterestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointOfInterestRepository
  extends JpaRepository<PointOfInterestEntity, Long> {}
