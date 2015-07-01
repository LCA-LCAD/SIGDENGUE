package controllers;

import com.avaje.ebean.Ebean;
import models.CupomDesconto;
import models.Suspeito;
import play.*;
import play.data.Form;
import play.mvc.*;
import views.html.*;

import java.util.List;

public class Application extends Controller {

    public static Result index(){
        List<Suspeito> suspeitos = Ebean.createQuery(Suspeito.class).findList();
        return ok(index.render(suspeitos));
    }

    public static Result formularioNovoCupom(){
        Form<CupomDesconto> form = Form.form(CupomDesconto.class);
        return ok(formularioNovoCupom.render(form));
    }

    public static Result novoCupom() {
        Form<CupomDesconto> form = Form.form(CupomDesconto.class).bindFromRequest();
        if (form.hasErrors()) {
            return badRequest(formularioNovoCupom.render(form));
        }
        CupomDesconto cupomDesconto = form.get();
        cupomDesconto.save();
        return redirect(routes.Application.index());
    }

    public static Result CadastrarSuspeito() {
        Form<Suspeito> form = Form.form(Suspeito.class);
        return ok(CadastrarSuspeito.render(form));
    }

    public static Result novoSuspeito() {
        Form<Suspeito> form = Form.form(Suspeito.class).bindFromRequest();
        if (form.hasErrors()) {
            return badRequest(CadastrarSuspeito.render(form));
        }
        Suspeito suspeito = form.get();
        suspeito.save();
        return redirect(routes.Application.index());
    }
    /*public static Result CadastrarSuspeito(){
        Form<Suspeito> form = Form.form(Suspeito.class);
        return ok(CadastrarSuspeito.render(form));
    }
    public static Result novoSuspeito(){
        Form<Suspeito> form = Form.form(Suspeito.class).bindFromRequest();
        if(form.hasErrors()){
            return badRequest(CadastrarSuspeito.render(form));
        }
        Suspeito suspeito = form.get();
        suspeito.save();
        return redirect(routes.Application.index());
    }*/

}
