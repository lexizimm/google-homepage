let userInput = prompt ("Choose your weapon...rock, paper, or scissors")
 userInput = userInput.toLowerCase();

//random choice from comp
function getComputerChoice(){
  let randomNumber =
      Math.floor(Math.random()*3);
  switch(randomNumber) {
    case 0:
      return('rock');
      break;
    case 1:
      return('paper');
      break;
    case 2:
      return('scissors');
      break;    
  }
}

function determineWinner(userChoice, computerChoice){
if(userChoice === 'bomb'){
  return 'You are the big winnnnnah'
}
  if (computerChoice === userChoice) {
  return 'It is a tie';
}            
if(userChoice === 'rock'){
    if(computerChoice === 'paper'){
      return 'The computer won!'
    }
    else {
      return 'You win!'     
    }
  }
            
if(userChoice === 'paper'){
    if(computerChoice === 'scissors'){
      return 'The computer won!'
    }
    else {
      return 'You win!'     
    }
  }
  
  if(userChoice === 'scissors'){
    if(computerChoice === 'rock'){
      return 'The computer won!'
    }
    else {
      return 'You win!'     
    }
  }
}
 
function playGame(){
  let userChoice = userInput;
  let computerChoice = getComputerChoice();
  console.log(`You chose ${userChoice}`); 
  alert(`The computer chose ${computerChoice}`);
  alert(determineWinner(userChoice, computerChoice)); 
}      
        
playGame();
