// * Fibonacci series ( 0 1 1 2 3 5 8 13 21 34... )

// Noobie
function Fibonacci_Noob(n) {
    const series = []
    let prev = 0; let curr = 1; let i = 0
    
    while (i<n) {
        series[i] = prev
        let temp = curr
        curr = prev+curr
        prev = temp
        i++
    }
    return series
}

