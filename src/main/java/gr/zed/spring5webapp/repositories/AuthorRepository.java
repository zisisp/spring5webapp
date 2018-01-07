package gr.zed.spring5webapp.repositories;


import gr.zed.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long>{
}
