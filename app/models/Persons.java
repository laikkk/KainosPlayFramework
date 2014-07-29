package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import java.util.Date;

import static play.data.validation.Constraints.Required;

/**
 * Created by kamilzie on 28.07.14.
 */
@Entity
public class Persons extends Model {

    @Id
    public long id;

    @Required
    @Constraints.MaxLength(100)
    @Column(length = 100) // @Column annotations is related with structure of table in database
    public String name;


    @Required
    @Constraints.MaxLength(100)
    @Column(length = 100)
    public String surname;

    @Required
    public Date birthdate;

    @Required
    @Constraints.MaxLength(200)
    @Column(length = 200)
    @Constraints.Pattern("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$")
    public String email;

    //Here should be relations one to many (Select element in html)
    @Required
    public int favoritedatabase;

    @Required
    @Constraints.MaxLength(5000)
    @Column(length = 5000)
    public String notes;


}
