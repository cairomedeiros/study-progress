let fs = require('fs');

for(let i = 1; i <= 2; i++){
    if(i < 10){
        
        i = `0${i}`;
    }
    fs.readFile(`./legenda_${i}.srt`, 'utf8', function(err, data){
    
        var dataComplete = data
        showConsole(dataComplete);
        //console.log(dataComplete);
        //console.log("##########################################################################################")
    });
}

function showConsole(x){
    console.log(x)
}
