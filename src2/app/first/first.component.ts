import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent implements OnInit {
  company : string;
  trainer : string;
  constructor() { 
    this.company="Hexaware";
    this.trainer = localStorage.getItem("trainer");
  }

  ngOnInit() {
  }

}
