'use strict';

//idk wat dit doet maar moet volgensmij anders werkt t nie
var guess = document.querySelector('.guess').value = '' ;
//maakt een random nummer onder de 20
let number = Math.trunc(Math.random() * 20);
//Je begin score
let score = 20;
//Highscore value = 0
let highscore = document.querySelector('.highscore'). value = '0';

//Om gewoon displayMessage te kunnen gebruik ipv de hele regel
let displayMessage = function(message){
    document.querySelector('.message').textContent = message;
}

//zodat het klikken werkt
document.querySelector('.check').addEventListener('click', function(){
     guess = Number(document.querySelector('.guess').value);

    
        //Not guess dus geen nummer
        if (! guess){
            //message in html veranderen
          document.querySelector('.message').textContent = 'No number!';

          //als  het nummer gelijk is aan number
        }else if (guess === number){
            //message in html veranderen
            displayMessage ('Correct number!');
            //Laat het nummer zien als je het goed hebt
            document.querySelector('.number').textContent = number;
            //Maakt het nummer groter als je het goed hebt
            document.querySelector('.number').style.width = '30rem';
            //achtergrondkleur veranderen
            document.querySelector('body').style.backgroundColor = '#60b347';

            //als score hoger is dan highscore
            if(score > highscore){
                //highscore word score
                highscore = score;
                //Laar de highscore zien in html
                document.querySelector('.highscore').textContent = highscore;
            }

          //als het nummer niet number is
        }else if(guess !== number){ 
            //als de score groter is dan 1 
            if(score > 1){
                //message in html veranderen
             displayMessage( 
                //als het nummer groter is dan numbeer ? als lager :
                guess > number
                ? 'To high!'
                : 'To low'
                );
            //Score -1 wanneer fout
            score = score -1 ;
            //score laten zien
            document.querySelector(".score").textContent = score;

            //als de score niet groter is dan 1
            }else{

                //message in html veranderen
                displayMessage('You\'ve lost!');
                //het nummer naar 0 zetten want het is niet hoger dan 1
                document.querySelector(".score").textContent = 0;
                //Laat het nummer zien
                document.querySelector('.number').textContent = number;
                //Veranderd achtergrond kleur
                document.querySelector('body').style.backgroundColor = '#DC143C';

            }
       
        }

})

  //zodat het klikken werkt 
  document.querySelector('.again').addEventListener('click', function(){ 

    //score word naar 20 gezet
    score = 20;

    //zet het nummer in het middan naar  ?
    document.querySelector('.number').textContent ='?';
    //Veranderd achtergrond kleur
    document.querySelector('body').style.backgroundColor = '#222';
    //Maakt het nummer naar 15 rem kwa breedte
    document.querySelector('.number').style.width = '15rem';
    //Veranderd de message
    displayMessage('Start guessing...');
    //Invoer veld naar leeg
    document.querySelector('.guess').value = '';
    //reset de score
    document.querySelector('.score').textContent = score;
    //reset het nummer dat je moet raden
    number =  Math.trunc(Math.random() * 20);


      


})
