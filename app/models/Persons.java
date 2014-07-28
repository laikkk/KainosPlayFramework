package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by kamilzie on 28.07.14.
 */
@Entity
public class Persons extends Model {

    @Id
    public long id;

   // @NotNull
   // @Size(max=100)
    public String name;

   // @NotNull
   // @Size(max=100)
    public String surname;
    public String birthdate;

   // @NotNull
   // @Size(max=200)
   // @Pattern(regexp="^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$")
    public String email;
    public String favoritedatabase; //TODO data type

   // @NotNull
   // @Size(max=5000)
    public String notes;


}
