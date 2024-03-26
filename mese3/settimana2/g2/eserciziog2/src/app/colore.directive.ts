import { Directive, ElementRef, Input } from '@angular/core';

@Directive({
  selector: '[appColore]'
})
export class ColoreDirective {

  constructor(private ref:ElementRef) { }

   @Input() colore:string[] = [
       'red',
       'yellow',
       'purple',
       'green',
       'pink'
   ]

    colorRandom() {
    let coloreCasuale = Math.floor(Math.random() *
    this.colore.length);
    return this.colore[coloreCasuale]
   }
   ngOnInit(){
    this.ref.nativeElement.style.backgroundColor = this.colorRandom()


   }

}
