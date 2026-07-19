function solution(n) {

    return Array.from({length: n - 4 + 1}, (_, i) => i + 4)
        .filter(i => isPrime(i))
        .length;
}

const isPrime = (i) => {
    for (let j = 2; j < i; j++) {
        if (i % j == 0) {
            return true;
        }
    }
    return false;
}
