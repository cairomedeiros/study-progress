import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.scss']
})
export class DataBindingComponent implements OnInit {
  public name: string = "cairo";
  public age: number = 22;

  public srczada: string = "https://static5.depositphotos.com/1037262/521/i/450/depositphotos_5215813-stock-photo-sunset-strip.jpg";

  public modelo: any = "";
  constructor() { }

  ngOnInit(): void {
  }

}
