import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Payment } from '../models/payment.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class PaymentService {

  constructor(private http:HttpClient) {}

  private paymentUrl = 'http://localhost:8896/payment';
  //private userUrl = '/api';

  public paymentUser(){
    return this.http.get<Payment[]>(this.paymentUrl+"/paymentuser/"+localStorage.getItem("TokenId"));
  }

  public getUsers() {
    return this.http.get<Payment[]>(this.paymentUrl); 
  }

  public deleteUser(pay) {
    return this.http.delete(this.paymentUrl + "/"+ pay.id);
  }

  public createUser(user) {
    return this.http.post<Payment>(this.paymentUrl, user);
  }

}
