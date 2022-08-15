"use strict";
let nome = 'cairo';
console.log(nome);
//tuplas
let endereco = ["rua tenete", 197];
console.log(endereco);
//enums
var DiasDaSemana;
(function (DiasDaSemana) {
    DiasDaSemana[DiasDaSemana["Segunda"] = 0] = "Segunda";
    DiasDaSemana[DiasDaSemana["terca"] = 1] = "terca";
    DiasDaSemana[DiasDaSemana["quarta"] = 2] = "quarta";
    DiasDaSemana[DiasDaSemana["quinta"] = 3] = "quinta";
    DiasDaSemana[DiasDaSemana["sexta"] = 4] = "sexta";
    DiasDaSemana[DiasDaSemana["sabado"] = 5] = "sabado";
    DiasDaSemana[DiasDaSemana["domingo"] = 6] = "domingo";
})(DiasDaSemana || (DiasDaSemana = {}));
let meudDia = DiasDaSemana.terca;
console.log(meudDia);
