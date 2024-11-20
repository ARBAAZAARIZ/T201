package com.arbaaz.CRUD_MYSQL.services;


import com.arbaaz.CRUD_MYSQL.BookProjection.BookProjection;
import com.arbaaz.CRUD_MYSQL.BookRespository;
import com.arbaaz.CRUD_MYSQL.model.Book;

import com.arbaaz.CRUD_MYSQL.wrapper.ResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


import java.util.List;

@Service
public class BookServices {
    @Autowired
    BookRespository bookRespository;

    @Autowired
    ResponseWrapper responseWrapper;

    public ResponseEntity<?> getAllBooks(){
        Iterable<Book> allBooks=bookRespository.findAll();
        responseWrapper.setMessage("following books added ");
        responseWrapper.setData(allBooks);
        return new ResponseEntity<>(responseWrapper, HttpStatus.OK);
    }

    public ResponseEntity<?> createBook(Book book){
        Book createedBook =bookRespository.save(book);
        responseWrapper.setMessage("following book added");
        responseWrapper.setData(createedBook);
        return new ResponseEntity<>(responseWrapper,HttpStatus.CREATED);
    }

    public ResponseEntity<?> getBookById(int id){
      Book bookfound =  bookRespository.findById(id).orElseThrow(
              () ->
              {
                  throw new ResponseStatusException(HttpStatus.NOT_FOUND, id+" id does not exit");
              }

      );
      responseWrapper.setMessage("following book found with id "+ id);
      responseWrapper.setData(bookfound);
      return new ResponseEntity<>(responseWrapper,HttpStatus.FOUND);

    }

    public ResponseEntity<?> deleteBookById(int id){
         bookRespository.findById(id).orElseThrow(
                () ->
                {
                    throw new ResponseStatusException(HttpStatus.NOT_FOUND, id+" id does not exit");
                }

        );
         bookRespository.deleteById(id);
        responseWrapper.setMessage("book with id "+ id + "deleted");
        responseWrapper.setData(null);
        return new ResponseEntity<>(responseWrapper,HttpStatus.OK);

    }

    public ResponseEntity<?> updateBookById(int id,Book book){
        Book book_found=bookRespository.findById(id).orElseThrow(
                () -> {
               throw new ResponseStatusException(HttpStatus.NOT_FOUND, id+" id does not exist");
                }
        );
        book.setId(book_found.getId());
        book.setCreatedAt(book_found.getCreatedAt());
      Book updatedBook=  bookRespository.save(book);

        responseWrapper.setMessage("book with id "+ id + "updated");
        responseWrapper.setData(updatedBook);
        return new ResponseEntity<>(responseWrapper,HttpStatus.OK);

    }

    public ResponseEntity<?> getBookByName(String bookname){
        Book book_found=bookRespository.findByBookName(bookname).orElseThrow(
                ()->{
                    throw new ResponseStatusException
                            (HttpStatus.NOT_FOUND, "Book with name  "+ bookname+" not found");
                }


        );
        responseWrapper.setMessage("Following book details found for book " + bookname);
        responseWrapper.setData(book_found);
        return new ResponseEntity<>(responseWrapper,HttpStatus.FOUND);
    }

    public ResponseEntity<?> getBookByAuthorName(String authorname)throws ResponseStatusException{
        List<Book> books=bookRespository.findByAuthorName(authorname);
        if(books.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "following books not found with authorName"+authorname);
        }else{
            responseWrapper.setMessage("Following book details found for authorname " + authorname);
            responseWrapper.setData(books);
            return new ResponseEntity<>(responseWrapper,HttpStatus.FOUND);
        }
    }

    public ResponseEntity<?> getBookNameAndAuthorName(String bookname,String authorname){
        Book book_found=bookRespository.findByBookNameAndAuthorName(bookname, authorname)
                .orElseThrow(
                        ()->{
                            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                                    "there is no bookss found by given bookname "+bookname
                                            +" author name "+authorname );
                        }
                );
        responseWrapper.setMessage("Following book found ");
        responseWrapper.setData(book_found);
        return new ResponseEntity<>(responseWrapper,HttpStatus.FOUND);
    }

    public ResponseEntity<?> getBookByPriceLessThan(double price){

        List<Book> books=bookRespository.findByPriceLessThan(price);
        if(books.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "following books not found with price"+price);
        }else{
            responseWrapper.setMessage("Following book details found for price " + price);
            responseWrapper.setData(books);
            return new ResponseEntity<>(responseWrapper,HttpStatus.FOUND);
        }

    }

    public ResponseEntity<?> getBookByIdWithOutPrice(int id){
        BookProjection bookfound =  bookRespository.findProjectedById(id).orElseThrow(
                () ->
                {
                    throw new ResponseStatusException(HttpStatus.NOT_FOUND, id+" id does not exit");
                }

        );
        responseWrapper.setMessage("following book found with id "+ id);
        responseWrapper.setData(bookfound);
        return new ResponseEntity<>(responseWrapper,HttpStatus.FOUND);

    }


}
