'use strict';


//Scores en dice selecteren
const score0EL = document.querySelector('#score--0');
const score1EL = document.querySelector('#score--1');
const diceEL = document.querySelector('.dice');
//Buttons selecteren
const btnNew = document.querySelector('.btn--new');
const btnRoll = document.querySelector('.btn--roll');
const btnHold = document.querySelector('.btn--hold');
//currentscore selecteren
const currentScore0EL = document.getElementById('current--0');         
const currentScore1EL = document.getElementById('current--1');
//Players selecteren
const player0EL =document.querySelector('.player--0');
const player1EL =document.querySelector('.player--1');
//creating starting conditions
score0EL.textContent = 0;
score1EL.textContent = 0;
diceEL.classList.add('hidden');


const scores = [0, 0]
let currentScore = 0;
let activePlayer = 0;


//Rol dobelsteen 
btnRoll.addEventListener('click', function() {
//Random nummer voor dobbelsteen
    const dice = Math.trunc(Math.random() * 6) + 1;

    //Laat dice roll zien
    diceEL.classList.remove('hidden');
    diceEL.src = `dice-${dice}.png`

    //Kijk of dice 1 is, als het 1 is switch player
   if (dice !== 1) {
       currentScore += dice;
       document.getElementById(`current--${activePlayer}`).textContent = currentScore

   }else{
       document.getElementById(`current--${activePlayer}`).textContent = 0;
       currentScore = 0;
       activePlayer = activePlayer === 0 ? 1:0;
       player0EL.classList.toggle('player--active');
       player1EL.classList.toggle('player--active');
   }


});

btnHold.addEventListener('click', function(){

    


});



/*
btnNew.addEventListener('click', function() {
    
score0EL.textContent = 0;
score1EL.textContent = 0;
currentScore = 0;

});
*/




