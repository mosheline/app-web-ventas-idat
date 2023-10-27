package pe.edu.idat.appwebventasidat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.appwebventasidat.model.bd.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
