namespace AppBanco
{
    internal class Program
    {
        static void Main(string[] args)
        {
            ContaBancaria c = new ContaBancaria();
            Console.Write("Entre com o número da conta: ");
            int numero = int.Parse(Console.ReadLine());
            Console.Write("Entre com o titular da conta: ");
            string titular = Console.ReadLine();
            Console.Write("Haverá deposito inicial? ");
            string confirm = Console.ReadLine();
            string confirmUpper = confirm.ToUpper();
            char first = confirmUpper[0];

            if(first == 'S')
            {
                Console.Write("Entre com o valor de deposito inicial: ");
                double saldo = double.Parse(Console.ReadLine());

                ContaBancaria cc = new ContaBancaria(numero, titular, saldo);

                Console.WriteLine(cc);
            }
            else if(first == 'N')
            {
                Console.WriteLine("salut!");
            }
            else
            {
                Console.WriteLine("Error");
            }

           

           
        }
    }
}