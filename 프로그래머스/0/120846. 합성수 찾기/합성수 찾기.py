def solution(n):
    return len(list(filter(isComposite, range(2, n + 1))))

def isComposite(param):
    for i in range(2, param):
        if param % i == 0:
            return True
    return False;