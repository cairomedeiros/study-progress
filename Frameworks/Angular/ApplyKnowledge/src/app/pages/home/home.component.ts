import { getNumberOfCurrencyDigits } from '@angular/common';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor() {}
  itemDia: string = "Child's day";
  myNumber: number = 0;
  nome: string = '';
  name: string = '';
  nomeIf: string = '';
  nomeFor = [
    {n: 'luizito soarez', age: 34},
    {n: 'lionel messi', age: 33},
    {n: 'osama bin wallace', age: 50},
    {n: 'gun zagueiro', age: 40}
  ];

  color: string = '';

  changeClassColor: boolean = false;

  ngOnInit(): void {
  }

  onChangeNumber(){
    this.myNumber += 1
  }

  changeBackground(){
    
  let randomColor ='#' + Math.floor(Math.random()*16777215).toString(16);
  this.color = randomColor;
  }

  changeClass(){
    this.changeClassColor = !this.changeClassColor;
    console.log(this.changeClassColor);
  }

}
