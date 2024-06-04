var iconUpFilter = document.getElementById('toggleIconUpFilter');
var iconDownFilter = document.getElementById('toggleIconDownFilter');
var FilterContainer = document.getElementById('FilterContainer');

iconDownFilter.addEventListener('click', function() {
    FilterContainer.style.display = 'block';
    iconUpFilter.style.display = 'inline';
    iconDownFilter.style.display = 'none';
});

iconUpFilter.addEventListener('click', function() {
    FilterContainer.style.display = 'none';
    iconUpFilter.style.display = 'none';
    iconDownFilter.style.display = 'inline';
});