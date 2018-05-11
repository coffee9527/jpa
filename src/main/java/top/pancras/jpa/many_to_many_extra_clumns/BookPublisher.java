package top.pancras.jpa.many_to_many_extra_clumns;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by pancras on 2018/5/11 0011.
 */
@Entity
@Table
@Data
public class BookPublisher implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @Id
    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

    @Column(name = "published_date")
    private Date publishedDate;
}
