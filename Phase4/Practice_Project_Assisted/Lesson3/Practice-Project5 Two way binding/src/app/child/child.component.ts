import { Component, EventEmitter, OnInit } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css'],
  inputs:['pdata'],  //P-C
  outputs:['cevent'], //C-P
})
export class ChildComponent implements OnInit {

  pdata:string="";  //P-C
  constructor() { }

  ngOnInit(): void {
  }

  //Child - Parent
  cevent= new EventEmitter<String>();
  onChange(value:string){
      this.cevent.emit(value);
  }

}
