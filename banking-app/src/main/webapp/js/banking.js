function toggleBalance() {
    const balance = document.getElementById('balance');
    if (balance.style.display === 'none') {
        balance.style.display = 'inline';
    } else {
        balance.style.display = 'none';
    }
}
