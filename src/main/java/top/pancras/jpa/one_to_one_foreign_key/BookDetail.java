package top.pancras.jpa.one_to_one_foreign_key;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by pancras on 2018/5/11 0011.
 */
@Entity
@Table(name = "book_detail")
@Data
public class BookDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "number_of_pages")
    private Integer numberOfPages;

    @OneToOne(mappedBy = "bookDetail")
    private Book book;

    public BookDetail() {
    }

    public BookDetail(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
