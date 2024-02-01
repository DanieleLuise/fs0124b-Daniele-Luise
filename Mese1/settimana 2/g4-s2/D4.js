/* ESERCIZIO 1
 Scrivi una funzione di nome "area", che riceve due parametri (l1, l2) e calcola l'area del rettangolo associato.
*/

let area = function (l1, l2){
    return l1 * l2
}
const areaTot = area(3,4)
console.log(areaTot);

/* ESERCIZIO 2
 Scrivi una funzione di nome "crazySum", che riceve due numeri interi come parametri.
 La funzione deve ritornare la somma dei due parametri, ma se il valore dei due parametri è il medesimo deve invece tornare
 la loro somma moltiplicata per tre.
*/

let crazySum = function (num1,num2){
    if (num1 === num2) {
        return (num1+num2) *3
    }
    else {
        return (num1+num2)
    }
}
console.log(crazySum(2,2))

/* ESERCIZIO 3
 Scrivi una funzione di nome "crazyDiff" che calcola la differenza assoluta tra un numero fornito come parametro e 19.
 Deve inoltre tornare la differenza assoluta moltiplicata per tre qualora il numero fornito sia maggiore di 19.
*/

let crazyDiff = function (num1){
    if (num1 > 19){
        return Math.abs(num1-19) * 3
    } else{
        if(num1 < 19){
            return Math.abs(num1 - 19)
        }
    }
}
console.log(crazyDiff(21));

/* ESERCIZIO 4
 Scrivi una funzione di nome "boundary" che accetta un numero intero n come parametro, e ritorna true se n è compreso tra 20 e 100 (incluso) oppure
 se n è uguale a 400.
*/

let boundary = function (n1){
    if (n1 > 20 && n1 <= 100 || n ===400){
        return 'true'
    } else {
        return 'false'
    }
}
console.log(boundary(21))


/* ESERCIZIO 5
 Scrivi una funzione di nome "epify" che accetta una stringa come parametro.
 La funzione deve aggiungere la parola "EPICODE" all'inizio della stringa fornita, ma se la stringa fornita comincia già con "EPICODE" allora deve
 ritornare la stringa originale senza alterarla.
*/

let epify = function (aggiunta){
    if (aggiunta.slice(0,8) === 'EPICODE'){
    return 'aggiunta'
    } else {
        return 'EPICODE' + aggiunta
    }
}
console.log(epify(' è una scuola difficile'))
console.log(epify(' è una scuola molto difficile'))
/* ESERCIZIO 6
 Scrivi una funzione di nome "check3and7" che accetta un numero positivo come parametro. La funzione deve controllare che il parametro sia un multiplo
 di 3 o di 7. (Suggerimento: usa l'operatore modulo)
*/

let check3and7 = function (n){
    if(n % 3 === 0 || n % 7 === 0){
    return 'true'
    } else {
        return 'false'
    }
}
console.log(check3and7(5))
console.log(check3and7(21));

/* ESERCIZIO 7
 Scrivi una funzione di nome "reverseString", il cui scopo è invertire una stringa fornita come parametro (es. "EPICODE" --> "EDOCIPE")
*/

 let reverseString = function (stringa1){
 let splitStringa1 = stringa1.split('')
 let reverseStringa1 = splitStringa1.reverse()
 let stringa1Finale = reverseStringa1.join('')
 return stringa1Finale
 }
 console.log(reverseString('EPICODE'));

/* ESERCIZIO 8
 Scrivi una funzione di nome "upperFirst", che riceve come parametro una stringa formata da diverse parole.
 La funzione deve rendere maiuscola la prima lettera di ogni parola contenuta nella stringa.
*/
  
 

/* ESERCIZIO 9
 Scrivi una funzione di nome "cutString", che riceve come parametro una stringa. La funzione deve creare una nuova stringa senza il primo e l'ultimo carattere
 della stringa originale.
*/

let cutString = function (stringa){
    return stringa.slice(- 0, stringa.lenght - 6)
}
console.log(cutString('EPICODE'));

/* ESERCIZIO 10
 Scrivi una funzione di nome "giveMeRandom", che accetta come parametro un numero n e ritorna un'array contenente n numeri casuali inclusi tra 0 e 10.
*/

 let giveMeRandom = function (n){
 let arr = []
 for(let i = 0; i < n; i++){
arr.push(Math.floor(Math.random) *10)
 }
return arr
 }
console.log(giveMeRandom(5))