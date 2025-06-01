<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bank Account Summary</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="js/banking.js"></script>
</head>
<body class="bg-light text-center p-5">
    <div class="container">
        <h1 class="mb-4">Welcome, ${accountHolder}</h1>
        <div class="card mx-auto shadow" style="max-width: 400px;">
            <div class="card-body">
                <h5 class="card-title">Account Balance</h5>
                <p class="card-text display-6">$<span id="balance">${balance}</span></p>
                <button class="btn btn-primary" onclick="toggleBalance()">Hide/Show Balance</button>
            </div>
        </div>
    </div>
</body>
</html>
