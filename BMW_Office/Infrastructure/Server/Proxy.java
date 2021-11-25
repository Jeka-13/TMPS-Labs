package BMW_Office.Infrastructure.Server;

public class Proxy implements IServer{
    private Server server;

    public Proxy(Server server) {
        this.server = server;
    }

    @Override
    public void Request() {
        if(this.CheckAccess()){
            this.server.Request();
        }
    }

    private boolean CheckAccess() {
        System.out.println("Proxy: Checking access prior to firing a real request.");

        return true;
    }
}
