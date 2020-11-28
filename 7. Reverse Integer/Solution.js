/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    let rev = parseInt(x.toString().split("").reverse().join(""));
    if (x < 0)
        rev = "-" + rev;
    if (rev > Math.pow(2, 31) - 1 || rev < -Math.pow(2, 31))
        return 0;
  return rev;
};