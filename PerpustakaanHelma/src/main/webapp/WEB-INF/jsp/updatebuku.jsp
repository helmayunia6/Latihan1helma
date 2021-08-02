<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
    <title>Edit Buku - Perpustakaan Helma</title>

    <!-- Favicons -->
    <link href="img/favicon.png" rel="icon">
    <link href="img/apple-touch-icon.png" rel="apple-touch-icon">

    <!-- Bootstrap core CSS -->
    <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!--external css-->
    <link href="lib/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href="lib/advanced-datatable/css/demo_page.css" rel="stylesheet" />
    <link href="lib/advanced-datatable/css/demo_table.css" rel="stylesheet" />
    <link rel="stylesheet" href="lib/advanced-datatable/css/DT_bootstrap.css" />
    <!-- Custom styles for this template -->
    <link href="css/style.css" rel="stylesheet">
    <link href="css/style-responsive.css" rel="stylesheet">

    <!-- =======================================================
      Template Name: Dashio
      Template URL: https://templatemag.com/dashio-bootstrap-admin-template/
      Author: TemplateMag.com
      License: https://templatemag.com/license/
    ======================================================= -->
</head>

<body>
<section id="container">
    <!-- **********************************************************************************************************************************************************
        TOP BAR CONTENT & NOTIFICATIONS
        *********************************************************************************************************************************************************** -->
    <!--header start-->
    <header class="header black-bg">
        <div class="sidebar-toggle-box">
            <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
        </div>
        <!--logo start-->
        <a href="index.html" class="logo"><b>HELMA<span>PERPUS</span></b></a>
        <!--logo end-->
        </div>
        <div class="top-menu">
            <ul class="nav pull-right top-menu">
                <li>
                    <c:url var="login" value="/login"></c:url>
                    <a class="logout" href="${login}">Logout</a>
                </li>
            </ul>
        </div>
    </header>
    <!--header end-->
    <!-- **********************************************************************************************************************************************************
        MAIN SIDEBAR MENU
        *********************************************************************************************************************************************************** -->
    <!--sidebar start-->
    <aside>
        <div id="sidebar" class="nav-collapse ">
            <!-- sidebar menu start-->
            <ul class="sidebar-menu" id="nav-accordion">
                <p class="centered"><a href="profile.html"><img src="img/logo.jpg" class="img-circle" width="80"></a></p>
                <h5 class="centered">Perpustakaan Helma</h5>
                <li class="sub-menu">
                    <c:url var="databuku" value="/databuku"></c:url>
                    <a class="active" href="${databuku}">
                        <i class="fa fa-th"></i>
                        <span>Data Buku</span>
                    </a>
                </li>
                <li class="sub-menu">
                    <c:url var="dataanggota" value="/dataanggota"></c:url>
                    <a href="${dataanggota}">
                        <i class="fa fa-desktop"></i>
                        <span>Data Anggota</span>
                    </a>
                </li>
                <li class="sub-menu">
                    <c:url var="peminjaman" value="/peminjaman"></c:url>
                    <a href="${peminjaman}">
                        <i class="fa fa-book"></i>
                        <span>Peminjaman</span>
                    </a>
                </li>
                <li class="sub-menu">
                    <c:url var="datapeminjaman" value="/datapeminjaman"></c:url>
                    <a href="${datapeminjaman}">
                        <i class="fa fa-book"></i>
                        <span>Data Peminjaman</span>
                    </a>
                </li>
                <li class="sub-menu">
                    <c:url var="pengembalian" value="/pengembalian"></c:url>
                    <a href="${pengembalian}">
                        <i class="fa fa-book"></i>
                        <span>Pengembalian</span>
                    </a>
                </li>
                <li class="sub-menu">
                    <c:url var="datapengembalian" value="/datapengembalian"></c:url>
                    <a href="${datapengembalian}">
                        <i class="fa fa-book"></i>
                        <span>Data Pengembalian</span>
                    </a>
                </li>

            </ul>
            <!-- sidebar menu end-->
        </div>
    </aside>
    <!--sidebar end-->
    <!-- **********************************************************************************************************************************************************
        MAIN CONTENT
        *********************************************************************************************************************************************************** -->
    <!--main content start-->
    <section id="main-content">
        <section class="wrapper">
            <h3><i class="fa fa-angle-right"></i>FORM UPDATE BUKU</h3>

            <div class="form-panel">
                <div class="form">
                    <form:form  id="buku" action="/updateBuku" modelAttribute="bukuDTO" method="POST"  class="cmxform form-horizontal style-form">

                        <div class="form-group">
                            <label for="kd_buku" class="col-sm-2 col-sm-2 control-label">Kode Buku</label>
                            <div class="col-sm-10">
                                <input name="kd_buku" class="form-control" id="disabledInput" type="text"  value="${bukuDTO.kd_buku}" disabled>
                            </div>
                        </div>

                        <div class="form-group ">
                            <label for="judul_buku" class="control-label col-lg-2">Judul Buku</label>
                            <div class="col-lg-10">
                                <input name="judul_buku" class="form-control" path="judul_buku" type="text" value="${bukuDTO.judul_buku}"/>
                            </div>
                        </div>
                        <div class="form-group ">
                            <label for="penerbit_buku" class="control-label col-lg-2">Penerbit Buku</label>
                            <div class="col-lg-10">
                                <input name="penerbit_buku" class="form-control" path="penerbit_buku" type="text" value="${bukuDTO.penerbit_buku}"/>
                            </div>
                        </div>
                        <div class="form-group ">
                            <label for="tahun_terbit" class="control-label col-lg-2">Tahun Terbit</label>
                            <div class="col-lg-10">
                                <input name="tahun_terbit" class="form-control" path="tahun_terbit" type="text" value="${bukuDTO.tahun_terbit}"/>
                            </div>
                        </div>
                        <div class="form-group ">
                            <label for="kategori_buku" class="control-label col-lg-2">Kategori Buku</label>
                            <div class="col-lg-10">
                                <select name="kategori_buku" class="form-control" path="kategori_buku">
                                    <option value="Novel">Novel</option>
                                    <option value="Cergam">Cergam</option>
                                    <option value="Komik">Komik</option>
                                    <option value="Ensiklopedi">Ensiklopedi</option>
                                    <option value="Novel Komik">Novel Komik</option>
                                    <option value="Antologi">Antologi</option>
                                    <option value="Dongeng">Dongeng</option>
                                    <option value="Biografi">Biografi</option>
                                    <option value="Jurnal">Jurnal</option>
                                    <option value="Novelet">Novelet</option>
                                    <option value="Fotografi">Fotografi</option>
                                    <option value="Karya Ilmiah">Karya Ilmiah</option>
                                    <option value="Tafsir">Tafsir</option>
                                    <option value="Panduan">Panduan</option>
                                    <option value="Atlas">Atlas</option>
                                    <option value="Teks">Teks</option>
                                </select>

                            </div>
                        </div>
                        <div class="form-group ">
                            <label for="jumlah" class="control-label col-lg-2">Jumlah</label>
                            <div class="col-lg-10">
                                <input name="jumlah" class="form-control" path="jumlah" type="text" value="${bukuDTO.jumlah}"/>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-lg-offset-2 col-lg-10">
                                <button class="btn btn-theme" type="submit" id="save">UPDATE</button>

                                <c:url var="databuku" value="/databuku"></c:url>
                                <button class="btn btn-theme04" type="button"><a href="${databuku}">Cancel</a></button>
                            </div>
                        </div>
                    </form:form>
                </div>
            </div>
            <!-- /form-panel -->
            </div>
            <!-- /col-lg-12 -->
            </div>
            <!-- /row -->
        </section>
        <!-- /wrapper -->
    </section>
</section>
<!-- /wrapper -->
</section>
<!-- /MAIN CONTENT -->
<!--main content end-->
<!--footer start-->
<footer class="site-footer">
    <div class="text-center">
        <p>
            &copy; Copyrights <strong>HelmaPerpus</strong>. All Rights Reserved
        </p>
        <div class="credits">
            <!--
              You are NOT allowed to delete the credit link to TemplateMag with free version.
              You can delete the credit link only if you bought the pro version.
              Buy the pro version with working PHP/AJAX contact form: https://templatemag.com/dashio-bootstrap-admin-template/
              Licensing information: https://templatemag.com/license/
            -->
        </div>

    </div>
</footer>
<!--footer end-->
</section>
<!-- js placed at the end of the document so the pages load faster -->
<script src="lib/jquery/jquery.min.js"></script>
<script type="text/javascript" language="javascript" src="lib/advanced-datatable/js/jquery.js"></script>
<script src="lib/bootstrap/js/bootstrap.min.js"></script>
<script class="include" type="text/javascript" src="lib/jquery.dcjqaccordion.2.7.js"></script>
<script src="lib/jquery.scrollTo.min.js"></script>
<script src="lib/jquery.nicescroll.js" type="text/javascript"></script>
<script type="text/javascript" language="javascript" src="lib/advanced-datatable/js/jquery.dataTables.js"></script>
<script type="text/javascript" src="lib/advanced-datatable/js/DT_bootstrap.js"></script>
<!--common script for all pages-->
<script src="lib/common-scripts.js"></script>
<!--script for this page-->
<script type="text/javascript">
    /* Formating function for row details */
    function fnFormatDetails(oTable, nTr) {
        var aData = oTable.fnGetData(nTr);
        var sOut = '<table cellpadding="5" cellspacing="0" border="0" style="padding-left:50px;">';
        sOut += '<tr><td>Rendering engine:</td><td>' + aData[1] + ' ' + aData[4] + '</td></tr>';
        sOut += '<tr><td>Link to source:</td><td>Could provide a link here</td></tr>';
        sOut += '<tr><td>Extra info:</td><td>And any further details here (images etc)</td></tr>';
        sOut += '</table>';

        return sOut;
    }

    $(document).ready(function() {
        /*
         * Insert a 'details' column to the table
         */
        var nCloneTh = document.createElement('th');
        var nCloneTd = document.createElement('td');
        nCloneTd.innerHTML = '<img src="lib/advanced-datatable/images/details_open.png">';
        nCloneTd.className = "center";

        $('#hidden-table-info thead tr').each(function() {
            this.insertBefore(nCloneTh, this.childNodes[0]);
        });

        $('#hidden-table-info tbody tr').each(function() {
            this.insertBefore(nCloneTd.cloneNode(true), this.childNodes[0]);
        });

        /*
         * Initialse DataTables, with no sorting on the 'details' column
         */
        var oTable = $('#hidden-table-info').dataTable({
            "aoColumnDefs": [{
                "bSortable": false,
                "aTargets": [0]
            }],
            "aaSorting": [
                [1, 'asc']
            ]
        });

        /* Add event listener for opening and closing details
         * Note that the indicator for showing which row is open is not controlled by DataTables,
         * rather it is done here
         */
        $('#hidden-table-info tbody td img').live('click', function() {
            var nTr = $(this).parents('tr')[0];
            if (oTable.fnIsOpen(nTr)) {
                /* This row is already open - close it */
                this.src = "lib/advanced-datatable/media/images/details_open.png";
                oTable.fnClose(nTr);
            } else {
                /* Open this row */
                this.src = "lib/advanced-datatable/images/details_close.png";
                oTable.fnOpen(nTr, fnFormatDetails(oTable, nTr), 'details');
            }
        });
    });
</script>
</body>

</html>