"use strict";
//classe produto - desafio
class Produto {
    constructor(nome, preco, desconto = 0) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }
}
const cadeira = new Produto("cadeira", 1300, 0);
const teclado = new Produto("Teaclado Red Dragon", 445.99);
//# sourceMappingURL=classes.js.map