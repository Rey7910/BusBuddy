import { Component, OnInit } from '@angular/core';
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
			{ name: "Por comenzar", y: 9.1 },
			{ name: "En curso", y: 3.7 },
			{ name: "Finalizada", y: 36.4 },

		]
	  }]
  }


  constructor(private estadisticasService:ServiceEstadisticasService) { 
    
  }

  ngOnInit(): void {


  }

}
