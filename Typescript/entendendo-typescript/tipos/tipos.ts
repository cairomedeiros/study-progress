let nome = 'cairo';

//tuplas

let endereco: [string, number] = ["rua tenete", 197];


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

//desafio

type ContaBancaria = {
    saldo: number, 
    depositar: (valor: number) => void
}

let contaBancaria: ContaBancaria = {
    saldo: 3456,
    depositar(valor: number) {
        this.saldo += valor
    }
}

let correntista: {nome: string, contaBancaria: ContaBancaria, contatos: string[] } = {
    nome: 'Ana Silva',
    contaBancaria: contaBancaria,
    contatos: ['34567890', '98765432']
}

correntista.contaBancaria.depositar(3000)
console.log(correntista)