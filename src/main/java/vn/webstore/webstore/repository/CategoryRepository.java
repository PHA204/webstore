package vn.webstore.webstore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vn.webstore.webstore.domain.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Short> {
}
