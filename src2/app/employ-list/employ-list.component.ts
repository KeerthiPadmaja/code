import { Component, OnInit } from '@angular/core';
import { Employ } from '../employ';

@Component({
  selector: 'app-employ-list',
  templateUrl: './employ-list.component.html',
  styleUrls: ['./employ-list.component.css']
})
export class EmployListComponent implements OnInit {

  constructor() { }
  employs = [
    new Employ(1, 'Sougata', 'Java', 'Programmer', 53334),
    new Employ(2, 'Aman', 'Angular', 'Programmer', 94455),
    new Employ(3, 'Arjun', 'Java', 'Programmer', 90334),
    new Employ(4, 'Hariharan', 'Angular', 'Programmer', 89044),
    new Employ(5, 'Niharika', 'Java', 'Programmer', 67755),
    new Employ(6, 'Nilani', 'Java', 'Programmer', 90455),
  ]

  ngOnInit() {
  }

}
