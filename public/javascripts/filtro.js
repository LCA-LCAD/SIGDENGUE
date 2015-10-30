$(function(){
    $("#tabela input").keyup(function(){        

        var index = $(this).parent().index();
        var nth = "#tabela td:nth-child("+(index+1).toString()+")";
        var valor = $(this).val().toUpperCase();
        $("#tabela tbody tr").show();
        $(nth).each(function(){
            if($(this).text().toUpperCase().indexOf(valor) < 0){
                $(this).parent().hide();
            }
        });
    });

    $("#tabela input").blur(function(){
        $(this).val("");
    }); 
});
$(function(){
    $("#tabela2 input").keyup(function(){        

        var index = $(this).parent().index();
        var nth = "#tabela2 td:nth-child("+(index+1).toString()+")";
        var valor = $(this).val().toUpperCase();
        $("#tabela2 tbody tr").show();
        $(nth).each(function(){
            if($(this).text().toUpperCase().indexOf(valor) < 0){
                $(this).parent().hide();
            }
        });
    });

    $("#tabela2 input").blur(function(){
        $(this).val("");
    }); 
});
$(function(){
    $("#tabela3 input").keyup(function(){        

        var index = $(this).parent().index();
        var nth = "#tabela3 td:nth-child("+(index+1).toString()+")";
        var valor = $(this).val().toUpperCase();
        $("#tabela3 tbody tr").show();
        $(nth).each(function(){
            if($(this).text().toUpperCase().indexOf(valor) < 0){
                $(this).parent().hide();
            }
        });
    });

    $("#tabela3 input").blur(function(){
        $(this).val("");
    }); 
});
$(function(){
    $("#tabela4 input").keyup(function(){        

        var index = $(this).parent().index();
        var nth = "#tabela4 td:nth-child("+(index+1).toString()+")";
        var valor = $(this).val().toUpperCase();
        $("#tabela4 tbody tr").show();
        $(nth).each(function(){
            if($(this).text().toUpperCase().indexOf(valor) < 0){
                $(this).parent().hide();
            }
        });
    });

    $("#tabela4 input").blur(function(){
        $(this).val("");
    }); 
});