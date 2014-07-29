package controllers;

import models.Persons;

import play.data.Form;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render(Form.form(Persons.class),""));
    }

    public static Result addPerson() {
        Form<Persons> filledForm = Form.form(Persons.class).bindFromRequest();

        if(filledForm.hasErrors()){
            return badRequest(index.render(filledForm,"Oh you did sth wrong"));
        }

        Persons persons = filledForm.get();
        persons.save();

        return ok(index.render(Form.form(Persons.class),"Row added ;)"));
    }
}

