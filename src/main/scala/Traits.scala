trait Stack[T]{
    def push(x: T): Stack[T]
    def pop: (T, Stack[T]) //sempre retorna o elemento que esta no topo 
    def peek: T
    def isEmpty: Boolean
    def size: Int
}

class ArrayStack[T] extends Stack[T]{
   override def push(x: T): Stack[T] = ???
    override def pop: (T, Stack[T]) = ???
    override def peek: T = ???
    override def isEmpty: Boolean = ???
    override def size: Int = ???

}