particlesJS("particles-js", {
    "particles": {
        "number": { "value": 80, "density": { "enable": true, "value_area": 800 } },
        "color": { "value": "#00f5ff" },
        "opacity": { "value": 0.3 },
        "size": { "value": 3 },
        "line_linked": { "enable": true, "distance": 150, "color": "#00f5ff", "opacity": 0.2, "width": 1 },
        "move": { "enable": true, "speed": 2 }
    },
    "interactivity": { "events": { "onhover": { "enable": true, "mode": "grab" } } }
});

function goTo(id) {
    document.querySelectorAll('.page').forEach(p => p.classList.remove('active'));
    document.getElementById(id).classList.add('active');
    window.scrollTo({top: 0, behavior: 'smooth'});
}

function choosePackage(name, price) {
    document.getElementById('projectType').value = "باقة: " + name;
    document.getElementById('packagePrice').value = "السعر: " + price;
    goTo('formPage');
}

function goToForm(service) {
    document.getElementById('projectType').value = service;
    document.getElementById('packagePrice').value = "حسب الطلب";
    goTo('formPage');
}
