package top.pancras.jpa.one_to_many;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by pancras on 2018/5/11 0011.
 */
@Entity
@Table
@Data
public class BookCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @OneToMany(mappedBy = "bookCategory", cascade = CascadeType.ALL)
    private Set<Book> books;

    public BookCategory(){

    }

    public BookCategory(String name) {
        this.name = name;
    }
}
