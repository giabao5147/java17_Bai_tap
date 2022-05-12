<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Trang dang nhap</title>
    <link rel="stylesheet" href="styles/bootstrap.min.css">
    <link rel="stylesheet" href="styles/style.css">
</head>
<body>

<div class="container-fluid">
    <div class="row block-1">
        <div class="col-md-12">
        </div>
    </div>

    <div class="row block-2">
        <div class="col-md-12">
            <div class="row block-2-row">
                <div class="col-md-2 block-2-1">
                </div>
                <div class="col-md-8 block-2-2">

                    <div class="form-group">
                        <form action="login" method="post">
                            <label>Nhập tên người chơi</label> <br>
                            <input type="text" name="userName" required> <br> <br>
                            <button type="submit" class="btn btn-primary" value="submit">Submit</button>
                        </form>
                    </div>

                </div>
                <div class="col-md-2 block-2-1">
                </div>
            </div>
        </div>
    </div>

    <div class="row block-1">
        <div class="col-md-12">
        </div>
    </div>
</div>

</body>
</html>
