function solution(numbers, direction) {
    if ('right' === direction) {
        numbers.splice(0, 0, numbers[numbers.length - 1]);
        return numbers.slice(0, numbers.length - 1);
    }
    else {
        numbers.splice(numbers.length, 0, numbers[0])
        return numbers.slice(1, numbers.length);
    }
}