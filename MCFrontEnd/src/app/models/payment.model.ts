import { User } from './user.model';
import { Mentor } from './mentor.model';
import { Trainings } from './trainings.model';
import { Technologies } from './technologies.model';

export class Payment {
  id:BigInteger;
  txnType:string;
  amount:number;
  remarks:string;
  user:User = new User();
  mentor:Mentor = new Mentor();
  trainings:Trainings = new Trainings();
  technologies:Technologies = new Technologies();
  user1:User[];
  mentor1:Mentor[];
  technologies1:Technologies[];
  trainings1:Trainings[];
  totalAmountToMentor:number;
 
}
