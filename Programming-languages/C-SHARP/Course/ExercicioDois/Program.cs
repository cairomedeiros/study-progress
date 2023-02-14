using System;

namespace ExercicioDois
{
    internal class Program {
        static void Main(string[] args) {

            Console.WriteLine("Boa tarde! Qual será o seu pedido?");
            Console.WriteLine("Cachorro quente = 1/preço = 4 reais");
            Console.WriteLine("X-salada = 2/preço = 4.50 reais");
            Console.WriteLine("X-bacon quente = 3/preço = 5 reais");
            Console.WriteLine("Torrada simples quente = 4/preço = 2 reais");
            Console.WriteLine("Refrigerante = 5/preço = 1.50 reais");
            Console.WriteLine("Digite o código");
            sbyte codigo = sbyte.Parse(Console.ReadLine());
            Console.WriteLine("Agora a quantidade");
            sbyte quantidade = sbyte.Parse(Console.ReadLine());

            switch (codigo) {
                case 1:
                    Console.WriteLine("total: R$ " + quantidade * 4);
                    break;
                case 2:
                    Console.WriteLine("total: R$ " + quantidade * 4.50);
                    break;
                case 3:
                    Console.WriteLine("total: R$ " + quantidade * 5);
                    break;
                case 4:
                    Console.WriteLine("total: R$ " + quantidade * 2);
                    break;
                case 5:
                    Console.WriteLine("total: R$ " + quantidade * 1.50);
                    break;
                default:
                    Console.WriteLine("Código inválido!");
                    break;
            }
        }
    }
}