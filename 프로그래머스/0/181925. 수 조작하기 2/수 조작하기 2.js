function solution(numLog) {
    
    return Array.from({length: numLog.length}, (_, i) => {
            if (i == 0) return null;

            const prv = numLog[i-1];
            const nxt = numLog[i];

            switch (nxt - prv) {
                case 1: 
                    return 'w';
                    break;
                case -1:
                    return 's';
                    break;
                case 10:
                    return 'd';
                    break;
                case -10:
                    return 'a';
                    break;

            }
        })
        .join('');
}