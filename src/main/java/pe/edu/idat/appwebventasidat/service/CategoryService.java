package pe.edu.idat.appwebventasidat.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.idat.appwebventasidat.model.bd.Category;
import pe.edu.idat.appwebventasidat.repository.CategoryRepository;

import java.util.List;
@Service // Es un componente del tipo servicio
@AllArgsConstructor /// PAra usar como constructor desde una interfaz  @Repository
public class CategoryService {
    private CategoryRepository categoryRepository;

    public List<Category>  listarCategorias(){
        return categoryRepository.findAll();
    }
}
