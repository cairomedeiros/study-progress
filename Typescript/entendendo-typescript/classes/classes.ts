//classe produto - desafio
class Produto {

    constructor(public nome: string, public preco: number, public desconto: number = 0 ){
        
    }
}

const cadeira = new Produto("cadeira", 1300, 0);

const teclado = new Produto("Teaclado Red Dragon", 445.99)


