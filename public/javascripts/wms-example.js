  var view = new ol.View({
	center: ol.proj.transform([-53.400000, -24.956000], 'EPSG:4326', 'EPSG:3857'),
	
	zoom:18,
});


var cvel = 
new ol.layer.Tile({
   source: new ol.source.MapQuest({layer: 'osm'})
 
 });
 
 
var sourcelotes =  new ol.source.TileWMS({
	//extent: [244442.578125,7231230.5,260484.9375, 7244692.5],
      url: 'http://localhost:8081/geoserver/wms',
      params: {'LAYERS': 'Sigdengue:LotesUTM_22S_SIRGAS2000'},
      serverType: 'geoserver',
	  crossOrigin:''
    });
	

 
var lotes = new ol.layer.Tile({
   source: sourcelotes
  });
  
 
var map = new ol.Map({
  layers: [cvel,lotes],
  target: 'map',

  view: view
  });


map.on('singleclick', function(evt) {
  document.getElementById('info').innerHTML = '';
  var viewResolution = /** @type {number} */ (view.getResolution());
  var url = sourcelotes.getGetFeatureInfoUrl(
      evt.coordinate, viewResolution, 'EPSG:3857',
      {'INFO_FORMAT': 'text/html'});
		console.log(url);
  if (url) {
    document.getElementById('info').innerHTML =
        '<iframe class="col-sm-12 alert-success" height="200" seamless src="' + url + '"></iframe>';
  }
});

map.on('pointermove', function(evt) {
  if (evt.dragging) {
    return;
  }
  var pixel = map.getEventPixel(evt.originalEvent);
  var hit = map.forEachLayerAtPixel(pixel, function(layer) {
    return true;
  });
  map.getTargetElement().style.cursor = hit ? 'pointer' : '';
});

