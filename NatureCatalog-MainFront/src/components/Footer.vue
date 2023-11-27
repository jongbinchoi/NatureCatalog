<template>
    <footer>
        <div class="footer-container">
            <div class="footer-left">
                <h1>NatureCatalog</h1>
            </div>
            <div class="footer-right">
                <div class="footer-right-item">
                    <h2>Team</h2>
                    <ul>
                    <li>강연준</li>
                    <li>최종빈</li>
                    <li>김재호</li>
                    <li>나우진</li>
                    <li>이도현</li>
                    </ul>
            </div>
                <div class="footer-right-item">
                    <h2>Project</h2>
                    <ul>
                        <li>Spring Boot</li>
                        <li>Vue.js</li>
                        <li>MySQL</li>
                        <li>MyBatis</li>
                        <li>Bootstrap</li>
                    </ul>
                    </div>
                </div>
            </div>
    </footer>
</template>

<style>
footer {
    background-color: #fff;
    color: #000;
    height: 200px;
    box-sizing: border-box;
}
ul {
    padding: 0;
}
li {
    list-style: none;
    margin-bottom: 10px;
    color:#6d6d6d;
    font-size: 0.7rem;
}
h2{
    margin-bottom: 5px;
}
.footer-container {
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding: 0 50px;
}
.footer-left {
    margin-left: 50px;
}
.footer-right {
    font-size: 0.8rem;
    display: flex;
    text-align: left;
    justify-content: space-between;
}
.footer-right > *{
    display: flex;
    flex-direction: column;
    padding-right: 100px;
}
@media screen and (max-width: 768px) {
    .footer-left{
        display: none;
    }
}
</style>