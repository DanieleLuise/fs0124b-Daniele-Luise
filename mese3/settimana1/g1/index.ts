// interfaccia Cellulare
interface Cellulare {
    credito: number
    numeroChiamate: number
    minutiChiamata: number

    ricarica(ammontare: number):void
    chiamata(numeroMinutiChiamata: number): void
    get numero404(): number
    get getNumeroChiamate(): number
    azzeraChiamate(): void

}

class User implements Cellulare {
    name: string
    lastName: string
    credito: number = 0
    numeroChiamate: number = 0
    minutiChiamata: number = 0
    constructor(name: string, lastName: string){
        this.name = name
        this.lastName = lastName
    }
    ricarica(ammontare: number):void{
        this.credito += ammontare
    }
    chiamata(minutiDurata: number): void {
        this.credito -= (minutiDurata * 0.20)
        this.numeroChiamate += 1
        this.minutiChiamata += minutiDurata

    }
    azzeraChiamate(): void {
        this.numeroChiamate = 0
    }
    get numero404() {
        return this.credito
    }
    get getNumeroChiamate() {
        return this.numeroChiamate
    }


}
const me = new User("Dany", "Luise")
me.ricarica(40)
me.chiamata(5)
me.chiamata(3)
me.chiamata(2)

console.log(me.numero404)
console.log(me.getNumeroChiamate)
me.azzeraChiamate()