import { Component, OnInit } from '@angular/core';
import { ObsTip } from 'src/app/models/tipoObs';
import { ObsTipCategoria } from 'src/app/models/tipoObsCategoria';
import { CategoriasService } from 'src/app/services/categorias.service';
import { EmployeeService } from 'src/app/services/employee.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  getAllEmployees: ObsTip[] = [{id: 0, nome: "", department: '', categoria_id: 1}];
  categoria: ObsTipCategoria[] = [];
  constructor(private employeeService: EmployeeService, private categoriaService: CategoriasService ) { }

  ngOnInit(): void {
  }

  getListEmployee(){
    this.employeeService.getEmployee().subscribe(
      res => {
        this.getAllEmployees = res;
        console.log(this.getAllEmployees)
      }
    )
  }

  getListCategorias(){
    this.categoriaService.getCategorias().subscribe(
      res => {
        this.categoria = res;
        console.log(this.categoria)
      }
    )
  }

}
