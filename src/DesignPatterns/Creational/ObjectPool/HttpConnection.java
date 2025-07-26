package DesignPatterns.Creational.ObjectPool;

public class HttpConnection {
    private String connectionUrl;
    boolean keepAlive = false;

    public HttpConnection(String connectionUrl) {
        this.connectionUrl = connectionUrl;
    }

    public String getConnectionUrl() {
        return connectionUrl;
    }
    public void setConnectionUrl(String connectionUrl) {
        this.connectionUrl = connectionUrl;
    }
}
