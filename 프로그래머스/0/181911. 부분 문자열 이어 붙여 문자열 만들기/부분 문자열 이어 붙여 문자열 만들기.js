function solution(my_strings, parts) {
    let answer = '';
    
    my_strings.forEach((val, idx) => {
        answer += val.substring(parts[idx][0], parts[idx][1] + 1);
    })
        
    return answer;
}