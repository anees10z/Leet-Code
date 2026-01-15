/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function (n) {

    return function () {
        let current = n++;
        return current;
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */