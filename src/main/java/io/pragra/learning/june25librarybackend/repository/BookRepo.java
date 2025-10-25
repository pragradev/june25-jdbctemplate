package io.pragra.learning.june25librarybackend.repository;

import io.pragra.learning.june25librarybackend.constants.SQLConstants;
import io.pragra.learning.june25librarybackend.dto.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class BookRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Book> getAllBooks(){

        RowMapper<Book> bookRowMapper = new RowMapper<Book>() {
            @Override
            public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
                Book book = new Book();
                book.setBookId(rs.getInt("BOOK_ID"));
                book.setName(rs.getString("NAME"));
                book.setIsbn(rs.getString("ISBN"));
                book.setAuthor(rs.getString("AUTHOR"));
                book.setLang(rs.getString("LANG"));
                return book;
            }
        };


        return jdbcTemplate.query(SQLConstants.BOOK_FETCH, bookRowMapper);
    }


    public List<Book> getAllBooksByBeanRowMapper(){




        return jdbcTemplate.query(SQLConstants.BOOK_FETCH, new BeanPropertyRowMapper<>(Book.class));
    }

}
