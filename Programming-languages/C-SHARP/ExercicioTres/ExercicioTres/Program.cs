﻿using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program {
        static void Main(string[] args) {

            int senha;

            do {
                Console.WriteLine("Digite a senha: ");
                senha = int.Parse(Console.ReadLine());

            } while (senha != 2002);

            Console.WriteLine("Acesso permitido!");
        }
    }
}