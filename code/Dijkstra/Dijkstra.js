const stack = require('../../data-structure/stack')


const evaluate = (str) => {
    str = str.trim().split('');

    // 运算栈
    let ops = new stack(),
        // 数字栈
        vals = new stack();

    str.filter(s => s.replace(/ /, '') !== '').map(s => {

        if (s === '(');
        else if (s === '+') ops.push(s);
        else if (s === '-') ops.push(s);
        else if (s === '*') ops.push(s);
        else if (s === '/') ops.push(s);
        else if (s === ')') {
            let op = ops.pop(),
                v = vals.pop();

            if (op === '(');
            else if (op === '+') v = vals.pop() + v;
            else if (op === '-') v = vals.pop() - v;
            else if (op === '*') v = vals.pop() * v;
            else if (op === '/') v = vals.pop() / v;

            vals.push(v);
        } else {
            vals.push(Number(s))
        }
    })

    const result = vals.pop();
    return result;
}

const ev = '(1 * (2 + 6))'
evaluate(ev)