def solution(numLog):
    convertMap = {1 : 'w',
                 -1 : 's',
                  10 : 'd',
                 -10 : 'a'}
    return ''.join(
        list(map(lambda x: convertMap[numLog[x] - numLog[x-1]], range(1, len(numLog))))
    )