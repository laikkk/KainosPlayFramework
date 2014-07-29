package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;


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
    public String name;
    // @Column(length = 100)

    @Required
    @Constraints.MaxLength(100)
    public String surname;
    // @Column(length =100)

    @Required
    public Date birthdate;

    @Required
    @Constraints.MaxLength(200)
    public String email;
    //  @Column(length = 200)
    //  @Constraints.Pattern("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$")

    @Required
    public int favoritedatabase;

    @Required
    @Constraints.MaxLength(5000)
    public String notes;
//  @Column(length = 5000)

}
