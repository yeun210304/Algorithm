def solution(myString):
    answer = list(filter(lambda x: x != '', myString.split('x')))
    answer.sort()
    return answer