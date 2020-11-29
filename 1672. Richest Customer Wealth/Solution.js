/**
 * @param {number[][]} accounts
 * @return {number}
 */
var maximumWealth = function(accounts) {
    let maxWealth = 0;
    let cummulative;
    for (let customer = 0; customer < accounts.length; customer++ ) {
        cummulative = 0;
        for (let bank = 0; bank < accounts[customer].length; bank++) {
            cummulative += accounts[customer][bank];
        }
        if (maxWealth < cummulative) 
            maxWealth = cummulative;
    }
    return maxWealth;
};