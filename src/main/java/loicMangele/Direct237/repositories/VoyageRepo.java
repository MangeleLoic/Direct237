package loicMangele.Direct237.repositories;

import loicMangele.Direct237.entities.Voyages;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VoyageRepo extends JpaRepository<Voyages, Long> {
    List<Voyages> findByOriginAndDestination(String origin, String destination);
}
