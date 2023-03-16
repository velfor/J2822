btnOpen.addEventListener("click", function(){
    newWin = window.open('https://itstep.org', 'StepWin', 'resizable');
    newWin.resizeTo(500,500); 
    newWin.moveTo(50,50);
})
btnClose.addEventListener("click",function(){
    newWin.close();
})
