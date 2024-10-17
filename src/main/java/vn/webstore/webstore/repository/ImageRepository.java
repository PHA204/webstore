package vn.webstore.webstore.repository;

import org.springframework.data.repository.CrudRepository;
import vn.webstore.webstore.domain.Images;

public interface ImageRepository extends CrudRepository<Images, Integer>{
    
}