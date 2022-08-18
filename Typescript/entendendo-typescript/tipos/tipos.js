"use strict";
let nome = 'cairo';
//tuplas
let endereco = ["rua tenete", 197];
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
let contaBancaria = {
    saldo: 3456,
    depositar(valor) {
        this.saldo += valor;
    }
};
let correntista = {
    nome: 'Ana Silva',
    contaBancaria: contaBancaria,
    contatos: ['34567890', '98765432']
};
correntista.contaBancaria.depositar(3000);
console.log(correntista);
//# sourceMappingURL=tipos.js.map