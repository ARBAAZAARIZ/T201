package com.arbaaz.CRUD_MYSQL.BookProjection;




import org.springframework.beans.factory.annotation.Value;

import java.time.Instant;

public interface BookProjection {

  @Value("#{target.id}")
    int getId();

  @Value("#{target.bookName}")
  String getBookName();

  @Value("#{target.authorName}")
  String getAuthorName();

  @Value("#{target.createdAt}")
  Instant getCreatedAt();

  @Value("#{target.updatedAt}")
  Instant getUpdatedAt();



}
