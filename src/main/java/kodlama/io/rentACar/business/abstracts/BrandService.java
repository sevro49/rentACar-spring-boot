package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BrandService {
    List<Brand> getAll();
}
