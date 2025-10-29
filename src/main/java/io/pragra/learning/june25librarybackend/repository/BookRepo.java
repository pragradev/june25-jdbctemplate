package io.pragra.learning.june25librarybackend.repository;

import io.pragra.learning.june25librarybackend.constants.SQLConstants;
import io.pragra.learning.june25librarybackend.dto.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class BookRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<BookDTO> getAllBooks(){

        RowMapper<BookDTO> bookRowMapper = new RowMapper<BookDTO>() {
            @Override
            public BookDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
                BookDTO bookDTO = new BookDTO();
                bookDTO.setBookId(rs.getInt("BOOK_ID"));
                bookDTO.setName(rs.getString("NAME"));
                bookDTO.setIsbn(rs.getString("ISBN"));
                bookDTO.setAuthor(rs.getString("AUTHOR"));
                bookDTO.setLang(rs.getString("LANG"));
                return bookDTO;
            }
        };


        return jdbcTemplate.query(SQLConstants.BOOK_FETCH, bookRowMapper);
    }


    public List<BookDTO> getAllBooksByBeanRowMapper(){




        return jdbcTemplate.query(SQLConstants.BOOK_FETCH, new BeanPropertyRowMapper<>(BookDTO.class));
    }

}
