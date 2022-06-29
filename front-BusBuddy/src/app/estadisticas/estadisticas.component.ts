import { Component, OnInit } from '@angular/core';
import { ContadoresView } from '../Modelo/ContadoresView';
import { ServiceEstadisticasService } from '../Service/service-estadisticas.service';
import { ServiceReservasService } from '../Service/service-reservas.service';

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
  


  constructor(private estadisticasService:ServiceEstadisticasService, private reservasService:ServiceReservasService) { 
    
  }
  estadosRutas:ContadoresView[];
  datosGrafica1:ContadoresView;
  contadores2=[0,0,0];
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
		this.reservasService.getReservas().subscribe(data=>{
			for(let i in data){
					this.contadores2[data[i].estado]++;
			}
			console.log(this.contadores2);


		});
		
  }

}
