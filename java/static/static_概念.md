### static的定位是全局的, 经典的例子是

### main方法被 pulic static 修饰

### 因为Java程序一开始就要运行main方法

### static方法就是没有this和super的方法

### 在static方法内部不能调用非静态方法，反过来是可以的

### 而且可以在没有创建任何对象的前提下

### 仅仅通过类本身来调用static方法

### 这实际上正是static方法的主要用途。