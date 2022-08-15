let nome = 'cairo';
console.log(nome);

//tuplas

let endereco: [string, number] = ["rua tenete", 197];
console.log(endereco);

//enums

enum DiasDaSemana{
    Segunda,
    terca,
    quarta,
    quinta,
    sexta,
    sabado,
    domingo
}

let meudDia: DiasDaSemana = DiasDaSemana.terca;

console.log(meudDia);