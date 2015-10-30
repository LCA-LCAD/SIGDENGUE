var center = ol.proj.transform([-53.467988330991943, -24.980990327488332], 'EPSG:4326', 'EPSG:3857');

var map = new ol.layer.Tile({
      source: new ol.source.MapQuest({layer: 'osm'})
    });
	
var VectorLayer = new ol.layer.Image({
      source: new ol.source.ImageVector({
        source: new ol.source.Vector({
          url: 'Data/lotescascavelgeo.geojson',
          format: new ol.format.GeoJSON()
        }),
        style: new ol.style.Style({
          fill: new ol.style.Fill({
            color: 'rgba(255, 255, 255, 0.6)'
          }),
          stroke: new ol.style.Stroke({
            color: '#0000ff',
            width: 1
          })
        })
      })
    });


var map = new ol.Map({
  layers: [ map , VectorLayer],
  target: 'map',
  view: new ol.View({
    center: center,
    zoom: 18
  })
});

var featureOverlay = new ol.layer.Vector({
  source: new ol.source.Vector(),
  map: map,
  style: new ol.style.Style({
    stroke: new ol.style.Stroke({
      color: '#ff0000',
      width: 1
    }),
    fill: new ol.style.Fill({
      color: 'rgba(255,0,0,0.1)'
    })
  })
});

var highlight;
var displayFeatureInfo = function(pixel) {

  var feature = map.forEachFeatureAtPixel(pixel, function(feature, layer) {
    return feature;
  });

  
  var logradouro = document.getElementById('rua');
  var numero = document.getElementById('numero');
  var tipo = document.getElementById('tipo');

var coordenadas = [];

  
  if (feature) {
    logradouro.value = feature.get('logradouro');
	numero.value = feature.get('numero');
	tipo.value = feature.get('utilizacao');

	
	
  } else {
	logradouro.value = feature.get('&nbsp');
	numero.value = feature.get('&nbsp');
	tipo.value = feature.get('&nbsp');

	}
	

	

  


  if (feature !== highlight) {
    if (highlight) {
      featureOverlay.getSource().removeFeature(highlight);
    }
    if (feature) {
      featureOverlay.getSource().addFeature(feature);
    }
    highlight = feature;
  }

};



map.on('click', function(evt) {
  if (evt.dragging) {
    return;
  }
  var pixel = map.getEventPixel(evt.originalEvent);
  displayFeatureInfo(pixel);
});

map.on('click', function(evt) {
  displayFeatureInfo(evt.pixel);
});
