using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExercicioDesconto {
    class Aluno {
        public string Name;
        public double NotaUm;
        public double NotaDois;
        public double NotaTres;

        public double NotaFinal() {
            return NotaUm + NotaDois + NotaTres;
        }

    }
}
