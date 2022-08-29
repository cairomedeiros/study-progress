import { Component, OnInit } from '@angular/core';
import { TaskList } from '../../model/task-list';

@Component({
  selector: 'app-todo-list',
  templateUrl: './todo-list.component.html',
  styleUrls: ['./todo-list.component.scss']
})
export class TodoListComponent implements OnInit {

  public tasklist: Array<TaskList> = [
    {task: "learn angular", checked: false}
  ];

  constructor() { }

  ngOnInit(): void {
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

}
