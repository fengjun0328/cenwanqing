package cn.pojo;

public class User {

    private Integer id;//编号
    private String username;//名称
    private String userpwd;//密码
    private Integer bm_id;//部门ID
    private Integer gw_id;//部门ID
    private String status;//在职情况

    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Integer getBm_id() {
        return bm_id;
    }
    public void setBm_id(Integer bm_id) {
        this.bm_id = bm_id;
    }

    public Integer getGw_id() {
        return gw_id;
    }

    public void setGw_id(Integer gw_id) {
        this.gw_id = gw_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
