let url = new URLSearchParams(location.search)
let id = url.get('id')

fetch(`https://striveschool-api.herokuapp.com/api/product/${id}`)
.then(res => res.json())
.then()