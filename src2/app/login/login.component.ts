import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private _router : Router) { }
  userName : string;
  passWord : string;
  validateMe() {
    localStorage.setItem("trainer","Prassana");
    if(this.userName=="Keerthi" && this.passWord=="12345") {
      //alert("Correct");
      this._router.navigate(['/menu']);

    } else {
      alert("Invalid");
    } 
  }

  ngOnInit() {
  }

}
