namespace ExercicioDesconto {
    internal class Program {
        static void Main(string[] args) {

            Aluno aluno = new Aluno();

            Console.WriteLine("Nome: ");
            aluno.Name = Console.ReadLine();
            Console.WriteLine("Primeiro trimestre: ");
            aluno.NotaUm = double.Parse(Console.ReadLine());
            Console.WriteLine("Segundo trimestre: ");
            aluno.NotaDois = double.Parse(Console.ReadLine());
            Console.WriteLine("Terceiro trimestre: ");
            aluno.NotaTres = double.Parse(Console.ReadLine());

            if(aluno.NotaFinal() >= 60) {
                Console.WriteLine("NOTA FINAL = " + aluno.NotaFinal());
                Console.WriteLine("APROVADO");
            }else if (aluno.NotaFinal() < 60) {
                Console.WriteLine("NOTA FINAL = " + aluno.NotaFinal());
                Console.WriteLine("REPROVADO");
                Console.WriteLine("FALTARAM " + (60 - aluno.NotaFinal()) + " PONTOS");
            }
            else {
                Console.WriteLine("algo deu errado");
            }

           

        }
    }
}