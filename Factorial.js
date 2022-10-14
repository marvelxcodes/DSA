// Factorial

function Factorial(n) {
    let value = 1
    for(let i = 2; i <= n; i++) {
        value = value*i
    }
    return value
}

// Big O Notation : O(n)