let orders = [];

function addOrder() {
    let id = document.getElementById("orderId").value;
    let name = document.getElementById("customerName").value;
    let product = document.getElementById("productName").value;

    let order = {
        id: id,
        name: name,
        product: product,
        status: "Pending"
    };

    orders.push(order);
    displayOrders();
}

function updateStatus() {
    let id = document.getElementById("updateId").value;
    let status = document.getElementById("newStatus").value;

    for (let order of orders) {
        if (order.id == id) {
            order.status = status;
        }
    }

    displayOrders();
}

function displayOrders() {
    let output = "";

    for (let order of orders) {
        output += `
        <div class="order-card">
            <p><b>ID:</b> ${order.id}</p>
            <p><b>Name:</b> ${order.name}</p>
            <p><b>Product:</b> ${order.product}</p>
            <p><b>Status:</b> ${order.status}</p>
        </div>
        `;
    }

    document.getElementById("ordersList").innerHTML = output;
}