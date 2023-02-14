using Microsoft.EntityFrameworkCore;
using TesteDois.Models;

namespace TesteDois.Data {
    public class PacienteDbContext : DbContext {
        public PacienteDbContext(DbContextOptions options) : base(options) {
        }

        public DbSet<Paciente> Pacientes { get; set; }
    }
}
