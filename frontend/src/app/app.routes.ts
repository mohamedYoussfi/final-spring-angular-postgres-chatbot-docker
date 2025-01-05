import { Routes } from '@angular/router';
import {ChatComponent} from "./chat/chat.component";
import {CryptoComponent} from "./crypto/crypto.component";

export const routes: Routes = [
  {path : "chat" , component : ChatComponent},
  {path : "hotels" , component : CryptoComponent}
];
