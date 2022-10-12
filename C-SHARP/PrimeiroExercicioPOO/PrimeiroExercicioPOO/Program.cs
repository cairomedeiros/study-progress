using System;

namespace PrimeiroExercicioPOO
{
    internal class Program {
        static void Main(string[] args) {
            Pessoa p1 = new Pessoa();
            Pessoa p2 = new Pessoa();
            Console.WriteLine("Digite o nome da primeira pessoa");

            p1.name = Console.ReadLine();
            Console.WriteLine("Digite a idade da primeira pessoa");
            p1.age = sbyte.Parse(Console.ReadLine());

            Console.WriteLine("Digite o nome da segunda pessoa");

            p2.name = Console.ReadLine();
            Console.WriteLine("Digite a idade da segunda pessoa");
            p2.age = sbyte.Parse(Console.ReadLine());

            if(p1.age > p2.age) {
                Console.WriteLine("pessoa mais velha é " + p1.name);
            }
            else {
                Console.WriteLine("pessoa mais velha é " + p2.name);
            }

        }
    }
}