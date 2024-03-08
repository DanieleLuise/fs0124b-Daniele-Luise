const salva = document.querySelector('#btn-salva')

salva.addEventListener('click', function (e){

let nome = document.querySelector('#nome').value
let brand = document.querySelector('#brand').value
let prezzo = document.querySelector('#prezzo').value
let immagine = document.querySelector('#id-url').value
let descrizione = document.querySelector('#textarea').value


let cell = {
    nome,
    brand,
    prezzo,
    immagine,
    descrizione
}

fetch('https://striveschool-api.herokuapp.com/api/product/',{
    method:'POST',
    headers: {
        'Content-type':'application/json',
        "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhZGJmMTJkN2IxMTAwMTkwZTZkZmQiLCJpYXQiOjE3MDk4OTA1NDUsImV4cCI6MTcxMTEwMDE0NX0.QUPl3m6dkNt75nWa50x5uYosAhiYHdS1IvnRqyFjaPo"
        },
        body:JSON.stringify(cell)
        
})
.then(res => res.json())
.then(res => {
    location.Href = 'index.html'
})


})