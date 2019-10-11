import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Mentor } from '../models/mentor.model';
import { MentorService } from './mentor.service';

@Component({
  selector: 'app-mentor',
  templateUrl: './homementor.component.html',
  styles: []
})
export class HomeMentorComponent implements OnInit {
   editField:ConstantSourceNode;
   private act:string = null;
  users: Mentor[];
  user: Mentor = new Mentor();
 private uname:string = null;
  constructor(private router: Router, private mentorService: MentorService) {

  }
  // updateList(mentorId: number, property: string, event: any) {
  //    this.editField = event.target.textContent;
  //   this.users[mentorId][property] = this.editField;
  // }

  updateUser(user):void{
    this.mentorService.updateUser(user).subscribe(data => {
      alert(user.active);
    })
  }

  changeValue(mentorId: number, property: string, event: any) {
    this.editField = event.target.textContent;
  }
  ngOnInit() {
    this.mentorService.activeData()
      .subscribe( data => {
    this.uname = localStorage.getItem('username');
        this.users = data;
      });
  };

  deleteUser(user: Mentor): void {
    this.mentorService.deleteUser(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };

}


