<%@ page contentType="text/html; charset=utf-8" language="java"
         import="java.sql.*" errorPage="" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Pipeline Bootstrap 4.0 Theme</title>
    <!-- load stylesheets -->
    <link rel="stylesheet"
          href="http://fonts.googleapis.com/css?family=Open+Sans:300,400">
    <!-- Google web font "Open Sans", https://fonts.google.com/ -->
    <link rel="stylesheet"
          href="<%=request.getContextPath()%>/font-awesome-4.6.3/css/font-awesome.min.css">
    <!-- Font Awesome, http://fontawesome.io/ -->
    <link rel="stylesheet"
          href="<%=request.getContextPath()%>/css/bootstrap.min.css">
    <!-- Bootstrap style, http://v4-alpha.getbootstrap.com/ -->
    <link rel="stylesheet"
          href="<%=request.getContextPath()%>/css/magnific-popup.css">
    <!-- Magnific pop up style, http://dimsemenov.com/plugins/magnific-popup/ -->
    <link rel="stylesheet"
          href="<%=request.getContextPath()%>/css/templatemo-style.css">
    <!-- Templatemo style -->

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <script type="text/javascript">

    </script>
</head>

<body>
<div class="container-fluid">

    <section id="welcome" class="tm-content-box tm-banner margin-b-10">
        <div class="tm-banner-inner">
            <h1 class="tm-banner-title">电子相册</h1>
              <a href="<%=request.getContextPath()%>/add.jsp"
                                               class="tm-nav-item-link tm-button"> <i
                            class="fa fa-image tm-nav-fa"></i>上传图片
                    </a>
        </div>
      
        
    </section>

    <div class="tm-body">
        <div class="tm-sidebar">
            <nav class="tm-main-nav">
                <ul class="tm-main-nav-ul">
                    <li class="tm-nav-item"><a href="#welcome"
                                               class="tm-nav-item-link tm-button"> <i
                            class="fa fa-smile-o tm-nav-fa"></i>Welcome
                    </a></li>
                    <li class="tm-nav-item"><a href="#gallery"
                                               class="tm-nav-item-link tm-button"> <i
                            class="fa fa-image tm-nav-fa"></i>Image Gallery
                    </a></li>
                
                </ul>
            </nav>
        </div>

        <div class="tm-main-content">

            <div class="tm-content-box tm-content-box-home">
                <img src="<%=request.getContextPath()%>/img/1200x800-01.jpg"
                     alt="Image 1" class="img-fluid tm-welcome-img">
                <div class="tm-welcome-boxes-container">
                    <div class="tm-welcome-box">
                        <div class="tm-welcome-text">
                            <h2 class="tm-section-title">Aliquam ante sapien</h2>
                            <p>Duis vel elit eu eros dapibus vestibulum vel vel nibh.
                                Nulla id ornare eros, at efficitur risus.</p>
                        </div>
                        <a href="#" class="tm-welcome-link tm-button">Learn More</a>
                    </div>
                    <div class="tm-welcome-box">
                        <div class="tm-welcome-text">
                            <h2 class="tm-section-title">Lorem ipsum dolor</h2>
                            <p>Vivamus eleifend ac turpis sit amet maximus. Nulla in
                                faucibus nisl, ut ultrices magna.</p>
                        </div>
                        <a href="#" class="tm-welcome-link tm-button">Read Details</a>
                    </div>
                </div>
            </div>
            <div class="copyrights">
                Collect from <a href="http://www.cssmoban.com/">企业网站模板</a>
            </div>

            <div id="gallery" class="tm-content-box">
                <div class="grid tm-gallery">
                    <c:forEach var="image" items="${imageList}">
                        <figure class="effect-bubba">
                            <img
                                    src="${image.imagename}" alt="Image 8" class="img-fluid"
                                    style="height: 300px"  onmouseover="">
                            <figcaption>
                                <h2>
                                    Light <span>Bridge</span>
                                </h2>
                                <p>Fusce faucibus metus in augue</p>
                                <a href="${image.imagename}" style="height: 500px; width: 500px">View
                                    more</a>
                            </figcaption>
                            <span style="display: none">${image.imgaeid}</span>
                        </figure>
                    </c:forEach>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- load JS files -->

<script src="<%=request.getContextPath()%>/js/jquery-1.11.3.min.js"></script>
<!-- jQuery (https://jquery.com/download/) -->
<script src="<%=request.getContextPath()%>/js/tether.min.js"></script>
<!-- Tether for Bootstrap (http://stackoverflow.com/questions/34567939/how-to-fix-the-error-error-bootstrap-tooltips-require-tether-http-github-h) -->
<script
        src="<%=request.getContextPath()%>/js/jquery.magnific-popup.min.js"></script>
<!-- Magnific pop-up (http://dimsemenov.com/plugins/magnific-popup/) -->
<script
        src="<%=request.getContextPath()%>/js/jquery.singlePageNav.min.js"></script>
<!-- Single Page Nav (https://github.com/ChrisWojcik/single-page-nav) -->

<!-- Templatemo scripts -->
<script>
    $(function() {

        //鼠标停留2秒后相应时间
        var shi = '';
        var headl = null;
        $(".effect-bubba").mouseover(function() {
            shi = $(this)
            headl = setTimeout(function() {
                var se = confirm("您确定要删除这张图片吗!");
                if (se == true) {
                    //异步删除图片

                    //获取id
                    var imageId =  shi.children("span").text();
                    $.post("<%=request.getContextPath()%>/image/imageServlet.do?method=deleteImageByImageId",{
                        imageId:imageId
                    },function (data) {
                        if(data==true){
                            location.reload();
                        }

                    })
                } else {

                }
            }, 2000)


        }).mouseout(function () {
            clearTimeout(headl)
        })
    })

    function setNavbar() {
        if ($(document).scrollTop() > 160) {
            $('.tm-sidebar').addClass('sticky');
        } else {
            $('.tm-sidebar').removeClass('sticky');
        }
    }

    $(document).ready(function() {

        // Single page nav
        $('.tm-main-nav').singlePageNav({
            'currentClass' : "active",
            offset : 20
        });

        // Detect window scroll and change navbar
        setNavbar();

        $(window).scroll(function() {
            setNavbar();
        });

        // Magnific pop up
        $('.tm-gallery').magnificPopup({
            delegate : 'a', // child items selector, by clicking on it popup will open
            type : 'image',
            gallery : {
                enabled : true
            }
            // other options
        });

    });
</script>

</body>
</html>