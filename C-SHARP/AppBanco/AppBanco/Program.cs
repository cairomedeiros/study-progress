namespace AppBanco
{
    internal class Program
    {
        static void Main(string[] args)
        {
            ContaBancaria conta;
            Console.Write("Entre com o número da conta: ");
            int numero = int.Parse(Console.ReadLine());
            Console.Write("Entre com o titular da conta: ");
            string titular = Console.ReadLine();
            Console.Write("Haverá deposito inicial? ");
            string confirm = Console.ReadLine();
            string confirmUpper = confirm.ToUpper();
            char first = confirmUpper[0];
            

            if (first == 'S')
            {
                Console.Write("Entre com o valor de deposito inicial: ");
                
                double saldoInicial = double.Parse(Console.ReadLine());

                conta = new ContaBancaria(numero, titular, saldoInicial);
                Console.WriteLine(conta);

            }
            else if(first == 'N')
            {
                conta = new ContaBancaria(numero, titular);
                Console.WriteLine(conta);
            }
            else
            {
                Console.WriteLine("Error");
            }
            

        }
    }
}