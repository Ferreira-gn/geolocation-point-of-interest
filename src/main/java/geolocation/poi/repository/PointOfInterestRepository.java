package geolocation.poi.repository;

import geolocation.poi.entity.PointOfInterestEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PointOfInterestRepository
  extends JpaRepository<PointOfInterestEntity, Long>
{
  @Query(
    """
      SELECT poi FROM PointOfInterestEntity poi
      WHERE ( poi.longitude BETWEEN :longMin AND :longMax )
        AND ( poi.latitude BETWEEN :latMin AND :latMax )
    """
  )
  List<PointOfInterestEntity> findNearMe(
    @Param("longMax") Long longMax,
    @Param("longMin") Long longMin,
    @Param("latMax") Long latMax,
    @Param("latMin") Long latMin
  );
}
