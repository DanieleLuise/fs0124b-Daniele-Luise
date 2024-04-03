import { Component, ViewChild } from '@angular/core';
import { FormBuilder, FormGroup, NgForm, Validators } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrl: './register.component.scss'
})
export class RegisterComponent {

form!:FormGroup;


constructor(private fb: FormBuilder){}

ngOnInit(){


    this.form = this.fb.group({
      nome: this.fb.control(null,[Validators.required]),
      cognome: this.fb.control(null,[Validators.required]),
      password: this.fb.control(null,[Validators.required]),
      controllaPassword: this.fb.control(null,[Validators.required])
    })

}

isValid(fieldName:string):boolean{
  const field = this.form.get(fieldName)
  if(!field) return false
  return field.valid
}

isTouched(fieldName:string):boolean{
  const field = this.form.get(fieldName)
  if(!field) return false
  return field.touched
}
ifValidAndTouched(fieldName:string){
  return this.isValid(fieldName) && this.isTouched(fieldName)

}
getErrors(fieldName:string){
  const field = this.form.get(fieldName)

  if(!field) return 'Invalid fieldName';

  return field.errors

}

  metodo(){
    console.log(this.form.value)
  }


}
