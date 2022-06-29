import { Component, OnInit } from '@angular/core';
import { ContadoresView } from '../Modelo/ContadoresView';
import { ServiceEstadisticasService } from '../Service/service-estadisticas.service';

@Component({
  selector: 'app-estadisticas',
  templateUrl: './estadisticas.component.html',
  styleUrls: ['./estadisticas.component.css']
})


export class EstadisticasComponent {

  chartOptions = {
	  animationEnabled: true,
	  theme: "dark2",
	  exportEnabled: true,
	  title: {
		text: "Estados de ruta"
	  },
	  subtitles: [{
		text: "Se muestran los estados actuales en los que se encuentran cada ruta"
	  }],
	  data: [{
		type: "pie", //change type to column, line, area, doughnut, etc
		indexLabel: "{name}: {y}%",
		dataPoints: [

		]
	  }]
  }


  constructor(private estadisticasService:ServiceEstadisticasService) { 
    
  }
  estadosRutas:ContadoresView[];
  datosGrafica1:ContadoresView;



  ngOnInit(): void {
	this.estadisticasService.getContadores().subscribe(data=>
		{
			this.estadosRutas=data;
			this.datosGrafica1=this.estadosRutas[0];
			console.log(this.datosGrafica1);
			this.chartOptions.data
		});
		
  }

}
