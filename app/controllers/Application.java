package controllers;

import com.avaje.ebean.Ebean;
import models.CupomDesconto;
import models.Endereco;
import models.RG;
import models.Suspeito;
import play.*;
import play.data.Form;
import play.mvc.*;
import views.html.*;

import java.util.List;

public class Application extends Controller {

    public static Result index(){
        List<Suspeito> suspeitos = Ebean.createQuery(Suspeito.class).findList();
        List<Endereco> enderecos = Ebean.createQuery(Endereco.class).findList();
        return ok(index.render(suspeitos, enderecos));
    }

    public static Result ListaEndereco(){
        List<Endereco> enderecos = Ebean.createQuery(Endereco.class).findList();
        return ok(ListaEndereco.render(enderecos));
    }

    public static Result formularioNovoCupom(){
        Form<CupomDesconto> form = Form.form(CupomDesconto.class);
        return ok(formularioNovoCupom.render(form));
    }

    public static Result novoRG(){
        Form<RG> formRG = Form.form(RG.class);
        return ok(CadastrarRG.render(formRG));
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
        Form<Suspeito> formSuspeito = Form.form(Suspeito.class);
        Form<Endereco> formEndSuspeito = Form.form(Endereco.class);
        return ok(CadastrarSuspeito.render(formSuspeito, formEndSuspeito));
    }

    public static Result CadastrarEndSuspeito() {
        Form<Endereco> formEndereco = Form.form(Endereco.class);
        List<Suspeito> suspeitos = Ebean.createQuery(Suspeito.class).findList();
        return ok(CadastrarEndSuspeito.render(formEndereco, suspeitos));
    }

    public static Result novoSuspeito() {
        Form<Suspeito> formSuspeito = Form.form(Suspeito.class).bindFromRequest();
        Form<Endereco> formEndSuspeito = Form.form(Endereco.class).bindFromRequest();
        System.out.println(formSuspeito);
        System.out.println(formEndSuspeito);
        if (formSuspeito.hasErrors() && formEndSuspeito.hasErrors()) {
            return badRequest(CadastrarSuspeito.render(formSuspeito, formEndSuspeito));
        }
        Suspeito suspeito = formSuspeito.get();
        Endereco endereco = formEndSuspeito.get();
        suspeito.save();
        endereco.save();
        List<Suspeito> suspeitos = Ebean.createQuery(Suspeito.class).findList();
        List<Endereco> enderecos = Ebean.createQuery(Endereco.class).findList();
        return ok(index.render(suspeitos, enderecos));
    }

    public static Result novoEndSuspeito() {
        List<Suspeito> suspeitos = Ebean.createQuery(Suspeito.class).findList();
        Form<Endereco> form = Form.form(Endereco.class).bindFromRequest();
        System.out.println(form);
        if (form.hasErrors()) {
            return badRequest(CadastrarEndSuspeito.render(form, suspeitos));
        }
        Endereco endereco = form.get();
        endereco.save();
        List<Endereco> enderecos = Ebean.createQuery(Endereco.class).findList();
        return ok(ListaEndereco.render(enderecos));
    }


}
