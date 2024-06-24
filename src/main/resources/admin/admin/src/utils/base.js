const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootul0e4/",
            name: "springbootul0e4",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootul0e4/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "旅游管理系统"
        } 
    }
}
export default base
