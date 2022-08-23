//classe produto - desafio
class Produto {

    constructor(public nome: string, public preco: number, public desconto: number = 0 ){
        
    }

    public resumo(): string {
        return `${this.nome} custa R$${this.precoComDesconto()} (${this.desconto * 100}% off)`
    }

    public precoComDesconto(): number {
         return this.preco * (1 - this.desconto);
    }
}

const cadeira = new Produto("cadeira", 1300, 0.09);
console.log(cadeira.resumo())

const teclado = new Produto("Teaclado Red Dragon", 445.99)


