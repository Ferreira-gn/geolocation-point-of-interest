package geolocation.poi;

import geolocation.poi.entity.PointOfInterestEntity;
import geolocation.poi.repository.PointOfInterestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PoiApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(PoiApplication.class, args);
  }

  @Autowired
  private PointOfInterestRepository repository;

  @Override
  public void run(String... args) throws Exception {
    repository.save(new PointOfInterestEntity("Lanchonete", 27L, 12L));
    repository.save(new PointOfInterestEntity("Posto", 31L, 18L));
    repository.save(new PointOfInterestEntity("Joalheria", 15L, 12L));
    repository.save(new PointOfInterestEntity("Floricultura", 19L, 21L));
    repository.save(new PointOfInterestEntity("Pub", 12L, 8L));
    repository.save(new PointOfInterestEntity("Supermercado", 23L, 6L));
    repository.save(new PointOfInterestEntity("Churrascaria", 28L, 2L));
  }
}
