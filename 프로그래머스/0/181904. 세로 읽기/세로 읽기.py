def solution(my_string, m, c):
    return ''.join(
        [my_string[x] if x % m == c - 1 else '' for x in range(0, len(my_string))]
    )