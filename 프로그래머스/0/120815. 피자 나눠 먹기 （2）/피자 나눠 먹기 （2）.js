function solution(n) {
return Array.from({ length: 100 }, (_, i) => i + 1)
        .find(e => (6 * e) % n == 0);
}