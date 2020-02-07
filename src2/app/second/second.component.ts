import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-second',
  templateUrl: './second.component.html',
  styleUrls: ['./second.component.css']
})
export class SecondComponent implements OnInit {
  name : string;
  age : number;
college : string;
trainer : string;
  constructor() { 
    this.name="Keerthi";
    this.age=21;
    this.college="Aditya College Of Engineering & Technology,Surampalem";
    this.trainer = localStorage.getItem("trainer");
  }

  ngOnInit() {
  }

}
