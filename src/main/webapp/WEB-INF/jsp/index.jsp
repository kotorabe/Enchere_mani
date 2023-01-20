<%@ page import="java.util.*"%>
<%@ page import="com.example.enchere.ModelAdmin.*"%>
<% String err = (String) request.getAttribute("err");%>
<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Enchère Admin</title>
    <!-- plugins:css -->
    <link rel="stylesheet" href="/front/vendors/feather/feather.css">
    <link rel="stylesheet" href="/front/vendors/ti-icons/css/themify-icons.css">
    <link rel="stylesheet" href="/front/vendors/css/vendor.bundle.base.css">
    <!-- endinject -->
    <!-- Plugin css for this page -->
    <link rel="stylesheet" href="/front/vendors/datatables.net-bs4/dataTables.bootstrap4.css">
    <link rel="stylesheet" href="/front/vendors/ti-icons/css/themify-icons.css">
    <link rel="stylesheet" type="text/css" href="/front/js/select.dataTables.min.css">
    <!-- End plugin css for this page -->
    <!-- inject:css -->
    <link rel="stylesheet" href="/front/css/vertical-layout-light/style.css">
    <!-- endinject -->
    <link rel="shortcut icon" href="/front/images/favicon.png" />
</head>

<body>
<div class="container-scroller">
    <div class="container-fluid page-body-wrapper full-page-wrapper">
        <div class="content-wrapper d-flex align-items-center auth px-0">
            <div class="row w-100 mx-0">
                <div class="col-lg-6 mx-auto">
                    <div class="auth-form-light text-left py-3 px-4 px-sm-10">
                        <div class="brand-logo">
                            <h2>Administrateur</h2>
                            <% if(err != null) {%>
                                <center><strong class="alert-danger"><%= err %></strong></center>
                            <% } %>
                        </div>
                        <h4>Bonjour!</h4>
                        <form class="pt-3" action="Admin/LoginAdmin" method="post">
                            <div class="form-group">
                                <input type="text" class="form-control form-control-lg" id="exampleInputEmail1" name="data01" placeholder="Username" required>
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control form-control-lg" id="exampleInputPassword1" name="data02" placeholder="Password" required>
                            </div>
                            <div class="mt-3">
                                <input type="submit" class="btn btn-success" value="LOG IN">
                            </div>
                            <div class="my-2 d-flex justify-content-between align-items-center">
                                <div class="form-check">
                                    <label class="form-check-label text-muted">
                                        <input type="checkbox" class="form-check-input">
                                        Keep me signed in
                                    </label>
                                </div>
                                <a href="#" class="auth-link text-black">Forgot password?</a>
                            </div>
                            <div class="text-center mt-4 font-weight-light">
                                Don't have an account? <a href="register.html" class="text-primary">Create</a>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!-- content-wrapper ends -->
    </div>
    <!-- page-body-wrapper ends -->
</div>
<!-- container-scroller -->

<!-- plugins:js -->
<script src="/front/vendors/js/vendor.bundle.base.js"></script>
<!-- endinject -->
<!-- Plugin js for this page -->
<script src="/front/vendors/chart.js/Chart.min.js"></script>
<script src="/front/vendors/chart.js/Chart.min.js"></script>
<script src="/front/vendors/datatables.net/jquery.dataTables.js"></script>
<script src="/front/vendors/datatables.net-bs4/dataTables.bootstrap4.js"></script>
<script src="/front/js/dataTables.select.min.js"></script>

<!-- End plugin js for this page -->
<!-- inject:js -->
<script src="/front/js/off-canvas.js"></script>
<script src="/front/js/hoverable-collapse.js"></script>
<script src="/front/js/template.js"></script>
<script src="/front/js/settings.js"></script>
<script src="/front/js/todolist.js"></script>
<!-- endinject -->
<!-- Custom js for this page-->
<script src="/front/js/dashboard.js"></script>
<script src="/front/js/Chart.roundedBarCharts.js"></script>
<!-- End custom js for this page-->
</body>

</html>