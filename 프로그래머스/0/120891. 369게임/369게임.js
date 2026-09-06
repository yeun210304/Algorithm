function solution(order) {
    let orderStr = order.toString();
    
    return Array.from({length: orderStr.length}, (_, i) => {
                    return +orderStr.charAt(i)
                })
                .filter(e => e != 0 && e % 3 == 0)
                .length;
}