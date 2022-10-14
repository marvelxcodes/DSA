
// Basic
function Fibonacci(n) {
    let prev = 0; let curr = 1; let i = 1
    
    while (i<=n) {
        console.log(prev)
        let temp = curr
        curr = prev+curr
        prev = temp
        i++
    }
}