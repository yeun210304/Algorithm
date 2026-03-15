function solution(n, k) {
    return Array.from({ length: n }, (_, idx) => idx+1)
            .filter(i => i % k == 0);
}