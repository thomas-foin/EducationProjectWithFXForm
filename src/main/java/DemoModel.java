import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.Min;

/**
 * Created with IntelliJ IDEA.
 * User: thomasfoin
 * Date: 19/04/13
 * Time: 10:31
 * To change this template use File | Settings | File Templates.
 */
public class DemoModel {
    private StringProperty name = new SimpleStringProperty();

    private StringProperty email = new SimpleStringProperty();

    private IntegerProperty age = new SimpleIntegerProperty();

    @Email
    public String getEmail(){return email.get();}

    public String getName(){return name.get();}

    @Min(value=7)
    public int getAge(){return age.get();}
}
