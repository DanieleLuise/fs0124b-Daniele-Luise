let tabellone = document.querySelector('.tabellone')
let button = document.querySelector('.bottone')




      function addNumbers (){
      for(i = 0; i <= 76; i++){
        let numbers = document.createElement('div')
        numbers.classList.add('numbers')
        numbers.innerText = i
        tabellone.append(numbers)
    }
}
addNumbers()