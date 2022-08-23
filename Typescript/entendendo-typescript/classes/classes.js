"use strict";
//classe produto - desafio
class Produto {
    constructor(nome, preco, desconto = 0) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }
    resumo() {
        return `${this.nome} custa R$${this.precoComDesconto()} (${this.desconto * 100}% off)`;
    }
    precoComDesconto() {
        return this.preco * (1 - this.desconto);
    }
}
const cadeira = new Produto("cadeira", 1300, 0.09);
console.log(cadeira.resumo());
const teclado = new Produto("Teaclado Red Dragon", 445.99);
//# sourceMappingURL=classes.js.map