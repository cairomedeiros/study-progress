namespace Funcionario {
    internal class Program {
        static void Main(string[] args) {
            FuncionarioEntitie f = new FuncionarioEntitie();

            Console.WriteLine("Nome:");
            f.Name = Console.ReadLine();
            Console.WriteLine("Salário Bruto: ");
            f.SalarioBruto = double.Parse(Console.ReadLine());
            Console.WriteLine("Imposto: ");
            f.Imposto = double.Parse(Console.ReadLine());

            Console.WriteLine("Funcionário: " + f.Name + ", $ " + f.SalarioLiquido());

            Console.WriteLine("Digite a porcentagem para aumentar o salário: ");
            double porcentagem = double.Parse(Console.ReadLine());
            f.AumentarSalario(porcentagem);

            Console.WriteLine("Dados atualizados: " + f.Name + ", $ " + f.SalarioLiquido());


        }
    }
}