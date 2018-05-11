package top.pancras.jpa.initial_value_generator;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by pancras on 2018/5/11 0011.
 */
@Entity
@Table
@Data
public class Address {
    @Id
    @Column( name = "ID" )
    @TableGenerator(
            name = "AppSeqStore",
            table = "APP_SEQ_STORE",
            pkColumnName = "APP_SEQ_NAME",
            pkColumnValue = "LISTENER_PK",
            valueColumnName = "APP_SEQ_VALUE",
            initialValue = 10000,
            allocationSize = 1 )
    @GeneratedValue( strategy = GenerationType.TABLE, generator = "AppSeqStore" )
    private long id;

    private String street;

    private String city;

    private String state;

    private String zip;
}
