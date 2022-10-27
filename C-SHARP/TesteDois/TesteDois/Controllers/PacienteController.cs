using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using TesteDois.Data;
using TesteDois.Models;

namespace TesteDois.Controllers {


    [ApiController]
    [Route("Api/[controller]")]
    public class PacienteController : Controller {
        private readonly PacienteDbContext dbContext;

        public PacienteController(PacienteDbContext dbContext) {
            this.dbContext = dbContext;
        }

        [HttpGet]
        public async Task<IActionResult> GetPacientes() {
            return Ok(await dbContext.Pacientes.ToListAsync());
        }

        [HttpPost]
        public async Task<IActionResult> AddPacientes(PacienteRequest pacienteRequest) {
            var paciente = new Paciente()
            {
                Id = Guid.NewGuid(),
                Nome = pacienteRequest.Nome,
                Endereco = pacienteRequest.Endereco,
            };

            await dbContext.Pacientes.AddAsync(paciente);
            await dbContext.SaveChangesAsync();

            return Ok(paciente);
        }

        [HttpPut]
        [Route("{id:guid}")]
        public async Task<IActionResult> UpdatePaciente([FromRoute] Guid id, UpdatePacienteRequest updatePacienteRequest) {

            var paciente = await dbContext.Pacientes.FindAsync(id);

            if (paciente != null)
            {
                paciente.Nome = updatePacienteRequest.Nome;
                paciente.Endereco = updatePacienteRequest.Endereco;

                await dbContext.SaveChangesAsync();

                return Ok(paciente);
            }

            return NotFound();
        }

        [HttpGet]
        [Route("{id:guid}")]
        public async Task<IActionResult> GetPacienteById([FromRoute] Guid id) {
            var paciente = await dbContext.Pacientes.FindAsync(id);
            
            if(paciente == null)
            {
                return NotFound();
            }

            return Ok(paciente);
        }

        [HttpDelete]
        [Route("{id:guid}")]
        public async Task<IActionResult> DeletePaciente([FromRoute] Guid id) {
            var paciente = await dbContext.Pacientes.FindAsync(id);

            if (paciente != null)
            {
                dbContext.Remove(paciente);
                await dbContext.SaveChangesAsync();

                return Ok(paciente);
            }

            return NotFound();
        }
    }
}
