package controllers;

import models.Persons;
import play.*;

import play.data.Form;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Maine new application is ready."));
    }

    public static Result addPerson() {
        Persons person = Form.form(Persons.class).bindFromRequest().get();
        person.save();
        return redirect(routes.Application.addPerson());
    }
}
