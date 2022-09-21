import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  products=[{name:"Pencil",price:"8.3",available:"16-09-2022",ratings:4.8},
  {name:"Pen",price:"10",available:"17-09-2022",ratings:5.0},
  {name:"Eraser",price:"5.3",available:"20-09-2022",ratings:4.2},
  {name:"Scale",price:"8.0",available:"16-09-2022",ratings:4.9},
  {name:"Books",price:"12",available:"30-09-2022",ratings:4.7},
  ];

  name:string="Renny";
  url:string="http://www.google.com";

  //Style Binding
  we:number=700;

  //Event Binding
  flag=false;
  show(){
    this.flag=!this.flag;
  }
}
