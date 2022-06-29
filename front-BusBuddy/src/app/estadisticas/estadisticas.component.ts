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
		text: "Developer Work Week"
	  },
	  subtitles: [{
		text: "Median hours/week"
	  }],
	  data: [{
		type: "pie", //change type to column, line, area, doughnut, etc
		indexLabel: "{name}: {y}%",
		dataPoints: [
			{ name: "Overhead", y: 9.1 },
			{ name: "Problem Solving", y: 3.7 },
			{ name: "Debugging", y: 36.4 },
			{ name: "Writing Code", y: 30.7 },
			{ name: "Firefighting", y: 20.1 }
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
		});
		
  }

}
