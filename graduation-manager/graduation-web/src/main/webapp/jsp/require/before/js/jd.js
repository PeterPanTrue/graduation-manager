var navli = document.getElementById("nav").children;//获取一级菜单
var con = document.getElementById("nav").getElementsByTagName("div"); //获取二级菜单
//var close=document.getElementsByClassName("closespan"); //IE9之前不支持这个
var timer;//延时显示二级菜单，不会有滑动感。
    //关闭按钮做的兼容
var id;
document.getElementsByClassName = function (className, parentElement) {
    var children = (parentElement || document.body).getElementsByTagName('*');
    var elements = [], child;
    for (var i = 0; i < children.length; i++) {
        var child = children[i];
        var classNames = child.className.split(' ');
        for (var j = 0; j < classNames.length; j++) {
            if (classNames[j] == className) {
                elements.push(child); //符合条件的元素加入到数组中
                break;
            }
        }
    }
    return elements;
};
var close = document.getElementById("nav");
var span=document.getElementsByClassName("closespan", close);
    //遍历一级菜单数组
for (var i = 0; i < navli.length-1; i++) {
    navli[i].index = i;//赋值编号
    span[i].index = i;
    navli[i].onmouseover = function () { //鼠标一级菜单移入事件
        id = this.index;
        //加上这个延时显示二级菜单就不行了，求解答。
        //timer=setTimeout("con[id].style.display = 'block';navli[id].className = 'navlihover';", 300) 
        con[id].style.display = "block"; //显示二级菜单
        navli[id].className = "navlihover"; //改变一级菜单边框
    }
    navli[i].onmouseout = function () { //移出事件
        clearTimeout(timer);//清除延时
        con[this.index].style.display = "none"; //隐藏二级菜单
        navli[this.index].className = ""; //改变一级菜单边框样式
    }
    span[i].onclick = function () { //关闭按钮
        con[this.index].style.display = "none"; //隐藏二级菜单
    }
}