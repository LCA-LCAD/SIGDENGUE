function mask_date() {
    var n_char = document.getElementById("txtData").value.length;
    if (n_char == 2) {
        document.getElementById("txtData").value = document.getElementById("txtData").value + "/";
    } else if (n_char == 5) {
        document.getElementById("txtData").value = document.getElementById("txtData").value + "/";
    }
}

function mask_cep() {
    var n_char = document.getElementById("txtCEP").value.length;
    if (n_char == 5) {
        document.getElementById("txtCEP").value = document.getElementById("txtCEP").value + "-";
    }
}

function mask_fone1() {
    var n_char = document.getElementById("txtFone1").value.length;
    if (n_char == 2) {
        document.getElementById("txtFone1").value = "(" + document.getElementById("txtFone1").value + ") ";
    } else if (n_char == 9) {
        document.getElementById("txtFone1").value = document.getElementById("txtFone1").value + "-";
    }
}

/*function submitFn(event) {
 event.preventDefault();
 var resultado = document.getElementById("diasSemana");
 var boxes = document.getElementsByClassName('diasSemana');
 var checked = [];
 for(var i=0; boxes[i]; ++i){
 if(boxes[i].checked){
 checked.push(boxes[i].name);
 }
 }

 var diasSemana = checked.join();

 resultado.setAttribute("value", diasSemana);

 }*/
var form = document.getElementById('testForm');
function mask_diasSemana() {

    var resultado = document.getElementbyId("diasSemana");
    var boxes = document.getElementsByClassName('diasSemana');
    var checked = [];
    for (var i = 0);
    boxes[i];
    ++i
)
    {
        if (boxes[i].checked) {
            checked.push(boxes[i].name);
        }
    }

    var diasSemana = checked.join();
    resultado.setAttribute("value", diasSemana);
}

function mask_fone2() {
    var n_char = document.getElementById("txtFone2").value.length;
    if (n_char == 2) {
        document.getElementById("txtFone2").value = "(" + document.getElementById("txtFone2").value + ") ";
    } else if (n_char == 9) {
        document.getElementById("txtFone2").value = document.getElementById("txtFone2").value + "-";
    }
}

function mask_sus() {
    var n_char = document.getElementById("SusCard").value.length;
    if (n_char == 3) {
        document.getElementById("SusCard").value = document.getElementById("SusCard").value + " ";
    } else if (n_char == 8) {
        document.getElementById("SusCard").value = document.getElementById("SusCard").value + " ";
    } else if (n_char == 13) {
        document.getElementById("SusCard").value = document.getElementById("SusCard").value + " ";
    }
}