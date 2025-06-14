package umg.edu.gt.repository;

import umg.edu.gt.model.Book;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class BookRepository implements PanacheRepository<Book> {
	
}
