def solution(order):
    orderStr = str(order)
    orderIntArr = map(lambda x: int(orderStr[x]), range(len(orderStr)))
    
    return len(list(filter(is_369, orderIntArr)))

def is_369(num):
    return num != 0 and num % 3 == 0