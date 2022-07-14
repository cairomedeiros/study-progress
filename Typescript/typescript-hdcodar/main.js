let array = [ 2, 3, 5, 7, 11, 13, 18, 34 ];

let newArray = array.filter((num) => {
  if(num % 2 == 0){
    return num
  }
});

let arraymapped = newArray.map((x) => {
    console.log(x)
})
 
 

 
