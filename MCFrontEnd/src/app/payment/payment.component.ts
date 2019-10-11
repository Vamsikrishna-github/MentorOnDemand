import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Payment } from '../models/payment.model';
import { PaymentService } from './payment.service';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styles: []
})
export class PaymentComponent implements OnInit {

  payment: Payment = new Payment();
  payment1 : Payment[];

  constructor(private router: Router, private paymentService: PaymentService) {

  }

  ngOnInit() {
    this.paymentService.getUsers()
      .subscribe( data => {
        this.payment1 = data;
        // alert(this.payment[3].technologies.technologies)
      });
  };

  deleteUser(pay: Payment): void {
    this.paymentService.deleteUser(pay)
      .subscribe( data => {
        this.payment1 = this.payment1.filter(u => u !== pay);
      })
  };

}


