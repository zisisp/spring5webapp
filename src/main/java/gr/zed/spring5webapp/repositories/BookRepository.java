package gr.zed.spring5webapp.repositories;

import gr.zed.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long>{
}
