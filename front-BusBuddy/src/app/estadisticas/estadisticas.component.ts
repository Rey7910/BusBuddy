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
		display: true,
	  animationEnabled: true,
	  theme: "dark2",
	  exportEnabled: true,
	  title: {
		text: "Estados de ruta"
	  },
	  subtitles: [{
		text: "Se muestran los estados actuales en los que se encuentran cada ruta"
	  }],data: [{}]
	  
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
			this.chartOptions.data=[{
				type: "pie", //change type to column, line, area, doughnut, etc
				indexLabel: "{name}: {y}",
				dataPoints: [
					{ name: "Por comenzar", y: this.datosGrafica1.rutasPorComenzar},
					{ name: "En curso", y: this.datosGrafica1.rutasenCurso },
					{ name: "Finalizada", y: this.datosGrafica1.rutasFinalizadas },
					{ name: "Demorada", y: this.datosGrafica1.rutasDemoradas }
				]
			  }];
			  
		});
		
  }

}
