package com.arbaaz.CRUD_MYSQL;

import com.arbaaz.CRUD_MYSQL.BookProjection.BookProjection;
import com.arbaaz.CRUD_MYSQL.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface BookRespository extends CrudRepository<Book,Integer> {

//    creating JPA method to find book by its name
    Optional<Book> findByBookName(String bookname);

    List<Book> findByAuthorName(String authorname);

    Optional<Book> findByBookNameAndAuthorName(String bookname,String authorName);

    List<Book> findByPriceLessThan(double price);

    // projection
    Optional<BookProjection> findProjectedById(int i);

}
