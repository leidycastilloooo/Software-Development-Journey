function calculateTotal() {
    const priceInput = document.getElementById('basePrice');
    const codeInput = document.getElementById('discountCode');
    const resultDiv = document.getElementById('result');

    const price = parseFloat(priceInput.value);
    const code = codeInput.value.trim().toUpperCase();

    // Validación básica
    if (isNaN(price) || price <= 0) {
        resultDiv.innerHTML = "<span style='color:red;'>Bitte geben Sie einen gültigen Preis ein.</span>";
        return;
    }

    let discount = 0;
    let shipping = 4.95; // Tarifa estándar de envío

    // Lógica de Negocio (Igual que en tus ejercicios de Java)
    if (code === "PROMO10") {
        discount = price * 0.10; // 10% de descuento
    } else if (code === "FREESHIP") {
        shipping = 0; // Envío gratis
    }

    const finalPrice = price - discount + shipping;

    // Mostrar el resultado en el HTML
    resultDiv.innerHTML = `
        <div style="display: flex; justify-content: space-between;">
            <span>Zwischensumme:</span> <span>${price.toFixed(2)}€</span>
        </div>
        <div style="display: flex; justify-content: space-between; color: green;">
            <span>Rabatt:</span> <span>-${discount.toFixed(2)}€</span>
        </div>
        <div style="display: flex; justify-content: space-between;">
            <span>Versand:</span> <span>${shipping.toFixed(2)}€</span>
        </div>
        <hr>
        <div style="display: flex; justify-content: space-between; font-weight: bold; font-size: 1.1rem;">
            <span>Gesamtbetrag:</span> <span>${finalPrice.toFixed(2)}€</span>
        </div>
    `;
}
