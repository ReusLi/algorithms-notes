class stack {
    constructor() {
        this.items = []
    }

    push (item) {
        this.items.unshift(item)
    }

    pop () {
        return this.items.splice(-1)[0]
    }
}


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

            if (s === '(');
            else if (s === '+') v = vals.pop() + v;
            else if (s === '-') v = vals.pop() - v;
            else if (s === '*') v = vals.pop() * v;
            else if (s === '/') v = vals.pop() / v;

            vals.push(v);
        }
    })

    const result = vals.pop();
    return result;
}

const ev = '1 + (2 + 3)'
evaluate(ev)