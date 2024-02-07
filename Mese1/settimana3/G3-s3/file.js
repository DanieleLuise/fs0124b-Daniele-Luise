
const botton = document.querySelector('#bottone')
const lista = document.querySelector('#lista')
const input = document.querySelector('#testo')

botton.addEventListener('click',function(){

let li = document.createElement('li')
li.innerText = input.value
li.classList.add('task')

li.addEventListener('click',function(){
    li.classList.toggle('completato')
})

let button = document.createElement('button')
button.innerText = 'Elimina'

button.addEventListener('click',function(){
    li.remove()
})

li.append(button)
lista.append(li)

})