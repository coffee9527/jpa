package top.pancras.jpa.one_to_one_primary_key;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by pancras on 2018/5/11 0011.
 */
@Entity
@Data
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "book")
    private BookDetail bookDetail;

    public Book() {

    }

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, BookDetail bookDetail) {
        this.name = name;
        this.bookDetail = bookDetail;
        this.bookDetail.setBook(this);
    }

    @Override
    public String toString() {
        return String.format(
                "Book[id=%d, name='%s', number of pages='%d']",
                id, name, bookDetail.getNumberOfPages());
    }
}
