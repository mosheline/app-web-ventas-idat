package pe.edu.idat.appwebventasidat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.appwebventasidat.model.bd.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
