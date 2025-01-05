import {Component, OnInit} from '@angular/core';
import {FormsModule} from "@angular/forms";
import {HttpClient, HttpClientModule} from "@angular/common/http";
import {MarkdownComponent, MarkdownService} from "ngx-markdown";
import {environment} from "../../environments/environment";

@Component({
  selector: 'app-chat',
  standalone: true,
  imports: [
    FormsModule, MarkdownComponent
  ],
  templateUrl: './chat.component.html',
  styleUrl: './chat.component.css',
})
export class ChatComponent implements OnInit{
  public message : string = "";
  public response : any;
  public loading : boolean =false;
  constructor(private http: HttpClient) {
  }
  ngOnInit() {

  }

  askChatBot() {
    this.loading=true;
    this.http.get(environment.backendHost+"/chat?message="+this.message, {responseType : 'text'})
      .subscribe({
        next : value => {
          this.response = value;
          this.loading=false;
        },
        error : err => {
          console.log(err);
          this.loading=false;
        }
      })

  }
}
