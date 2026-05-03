def solution(n):
    return next(
        filter(lambda x: (6 * x) % n == 0
            , range(1, 100))
                , None)