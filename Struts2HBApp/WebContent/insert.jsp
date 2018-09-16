<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="java.util.*;"%>

<html>

<head>
<title>Add Records</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />

<script type="text/javascript">
	function display() {
		document.fom.action = "verify.action";
		document.fom.submit();
	}
</script>

</head>

<body>

	<div align="center">
		<h1 style="color:green">Struts2 With Hibernate Integration Using MySQL Database</h1>
		<hr />
		<s:form action="insert" name="fom">


			<table class="mtableu">
				<tr>
					<td colspan="2"><input type="button" value="Display Records"
						onclick="display()"></td>
				</tr>

				<tr>
					<td><s:textfield label="Number" name="b.no" cssClass="bord" />
						<s:textfield label="Name" name="b.nam" cssClass="bord" /> <s:textfield
							label="Country" name="b.ct" cssClass="bord" /> <s:submit
							value="Add Record" /></td>
				</tr>
			</table>

		</s:form>


	</div>
</body>
</html>

