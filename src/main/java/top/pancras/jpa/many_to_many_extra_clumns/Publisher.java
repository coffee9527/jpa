package top.pancras.jpa.many_to_many_extra_clumns;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by pancras on 2018/5/11 0011.
 */
@Entity
@Table
@Data
public class Publisher implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @OneToMany(mappedBy = "publisher")
    private Set<BookPublisher> bookPublishers;

    public Publisher(){

    }

    public Publisher(String name){
        this.name = name;
    }
}
