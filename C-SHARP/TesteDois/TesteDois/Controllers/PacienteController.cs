using Microsoft.AspNetCore.Mvc;
using TesteDois.Data;

namespace TesteDois.Controllers {


    [ApiController]
    [Route("Api/[controller]")]
    public class PacienteController : Controller {
        private readonly PacienteDbContext dbContext;

        public PacienteController(PacienteDbContext dbContext) {
            this.dbContext = dbContext;
        }

        [HttpGet]
        public IActionResult GetPacientes() {
            return Ok(dbContext.Pacientes.ToList());
        }
    }
}
