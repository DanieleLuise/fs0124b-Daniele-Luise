



async function chiamata(query){

        const apiKey = 'bevESOUWoOfoZ3kW6e7js1QbctFouTUbO3fNCxExkqTmN8MDV4qmBDjF';


        return await fetch(`https://api.pexels.com/v1/search?query=${query}`, {
            method: 'GET',
            headers: {
                Authorization: apiKey
            }


        }).then(dati => dati.json())
}


    chiamata('cake').then(cakes => {

        console.log(cakes);

         let btn = document.querySelector('#bottone-load')
            btn.addEventListener('click', () =>{

                
                    chiamata('cake')
            })

    })