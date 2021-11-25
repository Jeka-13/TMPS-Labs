package BMW_Office.Infrastructure.Server;

public class Server implements IServer{
    @Override
    public void Request() {
        System.out.println("This car was found in server");
    }
}
