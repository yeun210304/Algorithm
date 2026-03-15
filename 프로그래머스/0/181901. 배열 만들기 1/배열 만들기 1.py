def solution(n, k):
    arr = range(1, n+1);
    return list(filter(lambda x: x % k == 0, arr))