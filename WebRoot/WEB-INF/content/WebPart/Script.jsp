<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<div>
	<!-- basic scripts -->

	<!--[if !IE]> -->
	<script type="text/javascript">
		window.jQuery
				|| document
						.write("<script src='${pageContext.request.contextPath}/assets/js/jquery.js'>"
								+ "<" + "/script>");
	</script>

	<!-- <![endif]-->

	<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='${pageContext.request.contextPath}/assets/js/jquery1x.js'>"+"<"+"/script>");
</script>
<![endif]-->
	<script type="text/javascript">
		if ('ontouchstart' in document.documentElement)
			document
					.write("<script src='${pageContext.request.contextPath}/assets/js/jquery.mobile.custom.js'>"
							+ "<" + "/script>");
		$(document).ready(function() {
			//得到当前页面href
			var url = window.location.href;
			//当前页面位于page下的路径，格式：A.B.C
			var pageInfo = url.split("/")[url.split("/").length - 1];
			var page = pageInfo.split(".");
			//第一次登录是进入控制台，tachometer
			if (page[1] == "tachometer") {
				$("#tachometer").addClass("active");
			}
			//其他A.B.C/A.B.C.D.do
			else if (page.length >= 3 && page[2] != "tachmeter") {
				$("#" + page[0]).addClass("active open");
				if (page[1] == "null") {
				} else {
					$("#" + page[1]).addClass("active open");
				}
				$("#" + page[2]).addClass("active");
			} else {
				alert("注意url命名规则！");
				window.location = "http://localhost:8080/PPMS";
			}

		});
		function myEachPopover(Name,Start, End) {

			$("a[name='"+Name+"']").each(
					function() {
						var info = $(this).attr("data-content").substring(
								Start, End);
						$(this).html(info);
					});
		}
		
	</script>
	<script>
		$(document).ready(function() {
			sessionuserid = $("#sessionuserid").text();
			$.get("authority.null.roleSearch.detail.init.do?roleID="+sessionuserid, function(data) {
				if (data.substr(0, 3) == "{\"p") {
					var obj = JSON.parse(data);
					var sysfunctions = obj.ppms.TbSystemfunctions;
					syslen = sysfunctions.length;
					for(i = 0;i<syslen;i++){
						idlength = sysfunctions[i].id.length;
						if(idlength == 1){
							url = sysfunctions[i].functionurl;
							console.log("1:" + url);
							try{
								$("#"+url).removeClass("hidden");
							}
							catch(e){
								console.log(e);
							}
						}
						else if(idlength == 2){
							url = sysfunctions[i].functionurl;
							if(url.indexOf("null") != -1){
								console.log("2null:" + url.split(".")[2]);
								try{
									$("#"+url.split(".")[2]).removeClass("hidden");
								}
								catch(e){
									console.log(e);
								}
							}
							else{
								try{
									$("#"+url).removeClass("hidden");
								}
								catch(e){
									console.log(e);
								}
							}
						}
						else if(idlength == 3){
							url = sysfunctions[i].functionurl;
							console.log("3:" + url);
							try{
								$("#"+url.split(".")[2]).removeClass("hidden");
							}
							catch(e){
								console.log(e);
							}
						}
					};
				};
			});
		});
	</script>
	<script src="${pageContext.request.contextPath}/assets/js/bootstrap.js"></script>

	<!-- ace scripts -->
	<script
		src="${pageContext.request.contextPath}/assets/js/ace/elements.scroller.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/ace/elements.colorpicker.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/ace/elements.fileinput.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/ace/elements.typeahead.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/ace/elements.wysiwyg.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/ace/elements.spinner.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/ace/elements.treeview.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/ace/elements.wizard.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/ace/elements.aside.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/ace/ace.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/ace/ace.ajax-content.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/ace/ace.touch-drag.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/ace/ace.sidebar.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/ace/ace.sidebar-scroll-1.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/ace/ace.submenu-hover.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/ace/ace.widget-box.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/ace/ace.settings.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/ace/ace.settings-rtl.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/ace/ace.settings-skin.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/ace/ace.widget-on-reload.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/ace/ace.searchbox-autocomplete.js"></script>
</div>