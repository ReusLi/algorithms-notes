class stack {
    constructor() {
        this.items = []
    }

    push (item) {
        this.items.unshift(item)
    }

    pop () {
        return this.items.shift();
    }
}

module.exports = stack;