class Stack {
    constructor() {
        this.first = null;
        this.N = 0;
        this.Node = class {
            constructor() {
                this.item = null;
                this.next = null;
            }
        }
    }

    isEmpty() {
        return this.first === null;
    }

    size() {
        return this.N;
    }

    push(item) {
        let oldFirst = this.first,
            node = new this.Node();
        node.item = item;
        node.next = oldFirst;
        this.first = node;
        this.N++;
    }

    pop() {
        const oldFirst = this.first;
        this.first = this.first.next;
        this.N--;
        return oldFirst;
    }
}