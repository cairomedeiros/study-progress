import { Component, OnInit, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child-home',
  templateUrl: './child-home.component.html',
  styleUrls: ['./child-home.component.css']
})
export class ChildHomeComponent implements OnInit {
  @Output() changeNumber: EventEmitter<any> = new EventEmitter();
  constructor() { }

  ngOnInit(): void {
  }

  handleClick(){
    this.changeNumber.emit();
  }
}
