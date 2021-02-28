import { Component } from '@angular/core';
import { CommonService } from './common.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'sessionsAU';
  allSession: Object;
  isEdit=false ;
  sessionObj={
    name:'',
    instructor : '',
    description : ''
  }

constructor(private commonService: CommonService){}
ngOnInit(){
  this.getLatestSession();
}

  addDetails(formObj) {
    console.log(formObj)
    this.commonService.createSession(formObj).subscribe((response)=>{
      this.getLatestSession();
    })
  }
  getLatestSession(){
    this.commonService.getAllSession().subscribe((response) =>{
      this.allSession=response
    })
  }
  editSession(session){
    this.isEdit=true;
    this.sessionObj=session ;
  }


  deleteSession(session){
    this.commonService.deleteSession(session).subscribe(() => {
      this.getLatestSession();
    
    })
}

updateSession(){
  this.isEdit=!this.isEdit;
  this.commonService.updateSession(this.sessionObj).subscribe(()=>{
    this.getLatestSession();
  })
}

}