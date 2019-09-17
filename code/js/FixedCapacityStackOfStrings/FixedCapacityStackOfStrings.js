/**
 * 定容字符串栈
 */

// const Stack = require('../../data-structure/stack');
const Stack = require('../../../data-structure/stack.node');

const str = 'to be or not to - be - - that - - - is';

const stack = new Stack();
const run = (str) => {
    let arr = str.split(' '),
        i = 0;
    while(i < arr.length) {
        let chat = arr[i];
        chat === '-'
            ? console.log(stack.pop(chat))
            : stack.push(chat)

        i++;
    }
}

run(str)