package geolocation.poi.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreatePoiDTO(
  @NotBlank(message = "Name is required") String name,
  @NotNull(message = "Latitude is required") Long latitude,
  @NotNull(message = "Longitude is required") Long longitude
) {}
