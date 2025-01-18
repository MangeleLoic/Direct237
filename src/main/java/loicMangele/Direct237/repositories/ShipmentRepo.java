package loicMangele.Direct237.repositories;

import loicMangele.Direct237.entities.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShipmentRepo extends JpaRepository<Shipment, Long> {
    List<Shipment> findByUserId(Long userId);
    List<Shipment> findByTravelId(Long travelId);
}
