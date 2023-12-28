function lengthOfLongestSubstring(s: string): number {
    let frontIndex = 0;
    let backIndex = 0;
    let solution = 0;

    const lettersSeen = new Set();

    while (backIndex < s.length) {
        if (lettersSeen.has(s[backIndex])) {
            if (lettersSeen.size > solution) {
                solution = lettersSeen.size;
            }

            while (s[frontIndex] != s[backIndex]) {
                lettersSeen.delete(s[frontIndex]);
                frontIndex += 1;
            }
            frontIndex +=1;
        } else {
            lettersSeen.add(s[backIndex]);
        }
        
        backIndex += 1;
    }

    if (lettersSeen.size > solution) {
        solution = lettersSeen.size;
    }

    return solution;
};