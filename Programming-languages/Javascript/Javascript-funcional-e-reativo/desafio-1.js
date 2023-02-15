//somar(y)(x)(z)
function somar(a){
    return function(b){
        return function(c){
            return a + b + c
        }
    }
}

console.log(somar(3)(3)(2))
//fn -> 3 * 7
//fn -> 3 + 7
//fn -> 3 - 7
//calcular(3)(7)(fn)
function subtrair(x, y){
    return x - y
}

function calcular(t){
    return function(u){
        return function(fn){
            return fn(t, u)
        }
    }
}

console.log(calcular(1)(4)(subtrair))