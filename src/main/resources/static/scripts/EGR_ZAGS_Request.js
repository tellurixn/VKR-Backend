function toggleSidebar() {
    const sidebar = document.getElementById('sidebar');
    const screen = document.getElementById('screen');
    
    if (sidebar.style.left === '0px') {
        sidebar.style.left = '-250px';
        screen.style.display = 'block';
    } else {
        sidebar.style.left = '0px';
        screen.style.display = 'none';
    }
}

var iconUpZAGS = document.getElementById('toggleIconUpZAGS');
var iconDownZAGS = document.getElementById('toggleIconDownZAGS');
var ZAGSContainer = document.getElementById('ZAGSContainer');

iconDownZAGS.addEventListener('click', function() {
    ZAGSContainer.style.display = 'block';
    iconUpZAGS.style.display = 'inline';
    iconDownZAGS.style.display = 'none';
});

iconUpZAGS.addEventListener('click', function() {
    ZAGSContainer.style.display = 'none';
    iconUpZAGS.style.display = 'none';
    iconDownZAGS.style.display = 'inline';
});


var iconUpRequest = document.getElementById('toggleIconUpRequest');
var iconDownRequest = document.getElementById('toggleIconDownRequest');
var RequestContainer = document.getElementById('RequestContainer');

iconDownRequest.addEventListener('click', function() {
    RequestContainer.style.display = 'block';
    iconUpRequest.style.display = 'inline';
    iconDownRequest.style.display = 'none';
});

iconUpRequest.addEventListener('click', function() {
    RequestContainer.style.display = 'none';
    iconUpRequest.style.display = 'none';
    iconDownRequest.style.display = 'inline';
});


var iconUpRequestData = document.getElementById('toggleIconUpRequestData');
var iconDownRequestData = document.getElementById('toggleIconDownRequestData');
var RequestDataContainer = document.getElementById('RequestDataContainer');

iconDownRequestData.addEventListener('click', function() {
    RequestDataContainer.style.display = 'block';
    iconUpRequestData.style.display = 'inline';
    iconDownRequestData.style.display = 'none';
});

iconUpRequestData.addEventListener('click', function() {
    RequestDataContainer.style.display = 'none';
    iconUpRequestData.style.display = 'none';
    iconDownRequestData.style.display = 'inline';
});

var addDocInfoButton = document.getElementById('addDocInfoButton');
var DocInfo = document.getElementById('DocInfo');

addDocInfoButton.addEventListener('click', function(){
    if(DocInfo.style.display === 'none'){
        DocInfo.style.display = 'block';
        addDocInfoButton.textContent ='Удалить';
    }
    else{
        DocInfo.style.display = 'none';
        addDocInfoButton.textContent ='Добавить';
    }
})