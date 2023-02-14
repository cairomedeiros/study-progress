using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppBanco
{
    internal class ContaBancaria
    {
        public int Numero { get; private set; }
        public string Titular { get; set; }
        public double Saldo { get; private set; }

        public ContaBancaria()
        {

        }
        public ContaBancaria(int numero, string titular)
        {
            Numero = numero;
            Titular = titular;
        }


        public ContaBancaria(int numero, string titular, double saldo) : this(numero, titular)
        {
            Saldo = saldo;
        }

        

        public void Deposito(double quantia)
        {
            Saldo += quantia;
        }

        public void Saque(double quantia)
        {
            Saldo = Saldo - quantia - 5;
        }

        public override string ToString()
        {
            return "Conta: " 
                + Numero 
                + ", Titular: "
                + Titular 
                + ", Saldo: " 
                +Saldo;
        }

    }
}
