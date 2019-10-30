/**
 *
 */
window.onload = function() {
  var canvas = document.getElementById('canvas2');
  if ( ! canvas || ! canvas.getContext ) {
  return false;
  }
  var ct = canvas.getContext('2d');
  ct.strokeStyle = '#009900';
  ct.strokeRect(0, 0, 100, 100);
}