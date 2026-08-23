function solution(board, k) {
    return Array.from({length: board.length}, (_, i) => {
        return Array.from({length: board[i].length}, (_, j) => {
                    if (i + j <= k) {
                        return board[i][j];
                    }
                    else return 0;
                })
                .reduce((a, b) => a + b, 0);
            })
            .reduce((a, b) => a + b, 0);
}