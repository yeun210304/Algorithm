from datetime import date

def solution(date1, date2):
    return 1 if date(date1[0], date1[1], date1[2]) < date(date2[0], date2[1], date2[2]) else 0