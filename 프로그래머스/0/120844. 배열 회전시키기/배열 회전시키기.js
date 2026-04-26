function solution(numbers, direction) {
    if ('right' === direction) {
        numbers.unshift(numbers.pop());
        return numbers;
    }
    else {
        numbers.push(numbers.shift());
        return numbers;
    }
}