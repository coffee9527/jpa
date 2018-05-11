package top.pancras.jpa.one_to_one_primary_key;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by pancras on 2018/5/11 0011.
 */
@Entity
@Data
public class BookDetail implements Serializable{
    @Id
    @OneToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @Column(name = "number_of_pages")
    private Integer numberOfPages;

    public BookDetail() {
    }

    public BookDetail(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
