import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Payment } from '../models/payment.model';
import { PaymentService } from './payment.service';

@Component({
  selector: 'app-paymentuser',
  templateUrl: './paymentuser.component.html',
  styles: []
})
export class PaymentUserComponent implements OnInit {

  payment: Payment = new Payment();
  payment1 : Payment[];

  constructor(private router: Router, private paymentService: PaymentService) {

  }

  ngOnInit() {
    this.paymentService.paymentUser()
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


