import numpy as np

def solution(arr):
    arrNp = np.array(arr)
    result = np.where(
        (arrNp >= 50) & (arrNp %2 == 0),
        arrNp / 2,
        np.where(
            (arrNp < 50) & (arrNp % 2 != 0),
            arrNp * 2,
            arrNp
        )
    )
    
    return result.astype(int).tolist()