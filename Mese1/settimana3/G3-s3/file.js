

function ciao (){
    let v1 = document.createElement('li')
    let input1 = document.getElementById('input').value
    let valore = document.createTextNode (input1)
    v1.appendChild(valore)
    if(input1 == ''){
        return null
    }else{
        return document.getElementById('ul').appendChild(v1);

    }
}
    
