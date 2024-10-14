const ball = document.querySelector('.ball');
const container = document.querySelector('.container');

const ballSize = 50;
const containerWidth = container.clientWidth;
const containerHeight = container.clientHeight;

let x = 0;
let y = 0;
let vx = 2; // velocity in x direction
let vy = 2; // velocity in y direction

function update() {
    if (x + vx < 0 || x + vx + ballSize > containerWidth) {
        vx = -vx;
    }
    if (y + vy < 0 || y + vy + ballSize > containerHeight) {
        vy = -vy;
    }

    x += vx;
    y += vy;

    ball.style.transform = `translate(${x}px, ${y}px)`;

    requestAnimationFrame(update);
}

update();
