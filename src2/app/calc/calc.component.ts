import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calc',
  templateUrl: './calc.component.html',
  styleUrls: ['./calc.component.css']
})
export class CalcComponent implements OnInit {

  constructor() { }
firstNo : number;
secondNo : number;
result : number;

 sum(){
 this.result=this.firstNo+this.secondNo;
 }

 sub(){
  this.result=this.firstNo-this.secondNo;
  }

  mul(){
    this.result=this.firstNo*this.secondNo;
    }
  ngOnInit() {
  }

}
