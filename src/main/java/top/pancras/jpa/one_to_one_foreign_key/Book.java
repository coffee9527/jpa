package top.pancras.jpa.one_to_one_foreign_key;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by pancras on 2018/5/11 0011.
 */
@Entity
@Data
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_detail_id")
//    @Lazy(false)
    private BookDetail bookDetail;

    public Book() {
    }

    public Book(String name, BookDetail bookDetail) {
        this.name = name;
        this.bookDetail = bookDetail;
    }
}
