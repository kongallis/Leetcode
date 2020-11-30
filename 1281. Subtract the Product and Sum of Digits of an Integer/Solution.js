/**
 * @param {number} n
 * @return {number}
 */
var subtractProductAndSum = function(n) {
    let array = n.toString().split("");
    let sum = 0;
    let product = 1;
    for (let i = 0; i < array.length; i++) {
        sum += Number(array[i]);
        product *= Number(array[i]);    
    }
    return product - sum;
};