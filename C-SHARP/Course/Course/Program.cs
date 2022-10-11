using System;

namespace Course
{
    internal class Program {
        static void Main(string[] args) {

                
            //primeira peça
            Console.WriteLine("Digite o valor do código da primeira peça: ");
            Console.ReadLine();
            Console.WriteLine("Quantidade de peças: ");
            sbyte quantidadePeçaUm = sbyte.Parse(Console.ReadLine());
            Console.WriteLine("Valor unitário da peça: ");
            sbyte valorPeçaUm = sbyte.Parse(Console.ReadLine());

            //segunda peça
            Console.WriteLine("Digite o valor do código da segunda peça: ");
            Console.ReadLine();
            Console.WriteLine("Quantidade de peças: ");
            sbyte quantidadePeçaDois = sbyte.Parse(Console.ReadLine());
            Console.WriteLine("Valor unitário da peça: ");
            sbyte valorPeçaDois = sbyte.Parse(Console.ReadLine());

            Console.WriteLine("VALOR APAGAR: R$ " + ((quantidadePeçaUm * valorPeçaUm) + (quantidadePeçaDois * valorPeçaDois)));
        }
    }
}