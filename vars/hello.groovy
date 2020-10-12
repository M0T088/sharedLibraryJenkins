import moto.HelloConnections.*

def moto() {
    HelloService service = new HelloService()
    String show = service.checkHello()
    echo show
   }
