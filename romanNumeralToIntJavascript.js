Given a roman numeral, convert it to an integer.

Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].

Solution:

const romanToInt = (s) => {
  let result = 0;
  
  const values = {
    I: 1,
    V: 5,
    X: 10,
    L: 50,
    C: 100,
    D: 500,
    M: 1000
  };
  
  for (let i = 0; i < s.length; i++) {
    let curr = values[s[i]];
    let next = values[s[i+1]];
    if (next && curr < next) {
      result -= curr;
    } else {
      result += curr;
    }
  }
  
  return result;
};
