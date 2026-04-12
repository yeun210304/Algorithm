function solution(my_string, m, c) {
    return Array.from({length: my_string.length}, (_, idx) => idx)
        .filter(i => i % m == c-1)
        .map(idx => my_string.charAt(idx))
        .join('');
}