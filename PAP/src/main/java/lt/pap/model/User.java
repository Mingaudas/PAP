package lt.pap.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(schema = "pap", name = "user")
public class User {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;


    @Column(name = "name", nullable = false, length = 255)
    private String name;


    public Integer getId()
    {
        return id;
    }


    public void setId(Integer id)
    {
        this.id = id;
    }


    public String getName()
    {
        return name;
    }


    public void setName(String name)
    {
        this.name = name;
    }
    
}
