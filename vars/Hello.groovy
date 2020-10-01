import moto.HelloConnections.*

def moto() {
    HelloService service = new HelloService()
    String show = service.checkHello()
    println (show)
   }
