def solution(n):
        return intSum(n+1) if n % 2 == 0 else oddSum(n+1)

def oddSum(n):
    return sum(range(1, n, 2))
 
def intSum(n):
    return sum([x * x for x in range(0, n, 2)])