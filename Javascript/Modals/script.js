'use strict';

const modelButtons = document.querySelectorAll('.show-modal');
const modal = document.querySelector('.modal');
const overlay = document.querySelector('.overlay');



for (let i = 0; i < modelButtons.length; i++)  {
modelButtons[i].addEventListener('click', () => {
  modal.classList.remove('hidden');
  overlay.classList.remove('hidden');
});
}
const closeBtn = document.querySelector('.close-modal');

function close_modal() {
  modal.classList.add('hidden');
  overlay.classList.add('hidden');
}
const body = document.body ;

closeBtn.addEventListener('click', () => { close_modal(); });

overlay.addEventListener('click', () => { close_modal(); })

body.addEventListener('keydown', (event) => {
    if(event.key == 'Escape')close_modal();
})
