import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';

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
      nome: this.fb.control(null),
      cognome: this.fb.control(null),
      password: this.fb.control(null),
      controllaPassword: this.fb.control(null)
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
