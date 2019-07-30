class stack {
    constructor() {
        this.items = []
        this.N = 0;
    }

    push (item) {
        this.items[this.N++] = item;
    }

    pop () {
        const item = this.items[--this.N];
        this.items[this.N] = undefined;
        return item;
    }

    isEmpty () {
        return this.N === 0;
    }

    size () {
        return this.N;
    }
}

module.exports = stack;