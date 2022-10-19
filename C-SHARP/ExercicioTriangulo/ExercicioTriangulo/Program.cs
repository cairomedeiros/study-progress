namespace ExercicioTriangulo {
    internal class Program {
        static void Main(string[] args) {

            Retangulo ret = new Retangulo();

            Console.WriteLine("entre com a largura e a altura do retângulo: ");
            ret.Largura = double.Parse(Console.ReadLine());
            ret.Altura = double.Parse(Console.ReadLine());

            Console.WriteLine(ret.ToString());
            
        }
    }
}