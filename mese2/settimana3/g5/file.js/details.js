let url = new URLSearchParams(location.search)
let id = url.get('id')

fetch(`https://striveschool-api.herokuapp.com/api/product/${id}`,{
    method:'GET',
    headers: {
        'Content-type':'application/json',
        "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhZGJmMTJkN2IxMTAwMTkwZTZkZmQiLCJpYXQiOjE3MDk4OTA1NDUsImV4cCI6MTcxMTEwMDE0NX0.QUPl3m6dkNt75nWa50x5uYosAhiYHdS1IvnRqyFjaPo"
        },
        
})
.then(res => res.json())
.then(telefono =>{

    let name = document.querySelector('#nome')
    let brand = document.querySelector('#brand')
    let price = document.querySelector('#prezzo')
    let description = document.querySelector('#descrizione')
    let imgUrl = document.querySelector('#img')

    name.innerText = telefono.name
    brand.innerText = telefono.brand
    price.innerText = telefono.price
    description.innerText = telefono.description
    imgUrl.src = telefono.imageUrl

})