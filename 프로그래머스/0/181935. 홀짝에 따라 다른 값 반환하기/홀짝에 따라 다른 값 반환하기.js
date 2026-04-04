function solution(n) {
    let answer = 0;
    const isOdd = n % 2 != 0;
    
    Array.from({length: n+1}, (_, idx) => idx)
        .filter(e => isOdd ? e % 2 != 0 : e % 2 == 0)
        .forEach(e => {
            answer += isOdd ? e : e*e;
        });

    return answer;
}