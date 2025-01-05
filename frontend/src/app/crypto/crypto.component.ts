import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {environment} from "../../environments/environment";

@Component({
  selector: 'app-hotels',
  standalone: true,
  imports: [],
  templateUrl: './crypto.component.html',
  styleUrl: './crypto.component.css'
})
export class CryptoComponent implements OnInit{
  cryptoCurrencies : any;
  constructor(private http : HttpClient) {
  }
  ngOnInit() {
    this.http.get(environment.backendHost+"/crypto").subscribe({
      next : value => {
        this.cryptoCurrencies = value;
      },
      error :err => {
        console.log(err);
      }
    })
  }

}
