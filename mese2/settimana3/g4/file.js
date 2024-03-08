



async function chiamata(query){

        const apiKey = 'bevESOUWoOfoZ3kW6e7js1QbctFouTUbO3fNCxExkqTmN8MDV4qmBDjF';


        return await fetch(`https://api.pexels.com/v1/search?query=${query}`, {
            method: 'GET',
            headers: {
                Authorization: apiKey
            }


        }).then(rep => rep.json())
}


   

        

         let btn = document.querySelector('.btn')
            btn.addEventListener('click', () =>{
                chiamata("pizza").then((dati) =>{
                    console.log(dati);
                    let img = document.querySelectorAll(".card-img-top");
                    dati.photos.forEach((photo, i) => {
                        img[i].src = photo.src.medium;
                        
                    });

                });

                   
            });

 