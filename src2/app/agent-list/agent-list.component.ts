import { Component, OnInit } from '@angular/core';
import { Agent } from '../agent';

@Component({
  selector: 'app-agent-list',
  templateUrl: './agent-list.component.html',
  styleUrls: ['./agent-list.component.css']
})
export class AgentListComponent implements OnInit {

  constructor() { }
    agents = [
    new Agent(1,'Keerthi', 'Rajulapudi', 'Kakinada', 3000),
    new Agent(2,'Nishkala', 'Kodukula', 'Kakinada', 4000),
    new Agent(3,'Sowmya', 'Nadimpalli', 'Hyderabad', 3500),
    new Agent(4,'Prathyusha', 'Garikapati', 'Chennai', 6500),
    new Agent(5,'Niharika', 'Avasarala', 'Kakinada', 7000),
  
  ]

  ngOnInit() {
  }

}
