
package top.maxim.im.common.bean;

/**
 */
public class UserBean extends BaseBean {

    private String userName;

    private long userId;

    private String userPwd;

    private String appId;

    private String server;

    private int port;

    private String restServer;

    private long timestamp;

    public UserBean(String userName, long userId, String userPwd, String appId, long timestamp) {
        this.userName = userName;
        this.userId = userId;
        this.userPwd = userPwd;
        this.appId = appId;
        this.timestamp = timestamp;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getRestServer() {
        return restServer;
    }

    public void setRestServer(String restServer) {
        this.restServer = restServer;
    }
}
