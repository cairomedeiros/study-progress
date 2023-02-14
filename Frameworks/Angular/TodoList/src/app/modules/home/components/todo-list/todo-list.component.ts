import { Component, DoCheck } from '@angular/core';
import { TaskList } from '../../model/task-list';

@Component({
  selector: 'app-todo-list',
  templateUrl: './todo-list.component.html',
  styleUrls: ['./todo-list.component.scss']
})
export class TodoListComponent implements DoCheck {

  public tasklist: Array<TaskList> = JSON.parse(localStorage.getItem("list") || '[]');

  constructor() { }

  ngDoCheck(): void {
    this.setLocalStorage();
  }
  public setEmitTaskList(event: string){
      this.tasklist.push({task: event, checked: false});
    
  }

  public deleteItemTaskList(event: number){
    this.tasklist.splice(event, 1);
  }

  public deleteAllTaskList(): void {
    const confirm = window.confirm("Realmente deseja deletar tudo?");

    if(confirm){
      this.tasklist = [];
    }
  }

  public validationInput(event: string, index: number){
    if(!event.length){
      const confirm = window.confirm("Tem certeza que quer deletar?");

      if(confirm){
        this.deleteItemTaskList(index);
      }
    }
  }

  public setLocalStorage() {
    if(this.tasklist){
      this.tasklist.sort((first, last) => Number(first.checked) - Number(last.checked) );
      localStorage.setItem("list", JSON.stringify(this.tasklist));
    }
  }

}
