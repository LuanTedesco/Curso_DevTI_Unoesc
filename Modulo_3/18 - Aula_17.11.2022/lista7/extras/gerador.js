function* fibonacci() {
    let [atual, proximo] = [0, 1]
    while (true) {
        yield atual;
        [atual, proximo] = [proximo, atual + proximo]
    }
}

fib1 = fibonacci()
for (let i = 0; i < 5; i++) {
    console.log(fib1.next().value)
}

console.log(fib1.next());
// let [...primeiros10] = fibonacci(10);
// console.log(primeiros10);
