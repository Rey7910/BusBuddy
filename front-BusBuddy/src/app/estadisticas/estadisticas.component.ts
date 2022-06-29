import { Component, OnInit } from '@angular/core';
import { ContadoresView } from '../Modelo/ContadoresView';
import { ServiceEstadisticasService } from '../Service/service-estadisticas.service';
import { ServiceUsuarioService } from '../Service/service-usuario.service';
import { Usuario } from '../Modelo/Usuario';

@Component({
  selector: 'app-estadisticas',
  templateUrl: './estadisticas.component.html',
  styleUrls: ['./estadisticas.component.css']
})


export class EstadisticasComponent {
	usu: Usuario[]
	cant_clientes: number;
	cant_cond: number;
	cant_admin: number;

	

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

	chartOptions2 = {
		display: true,
	animationEnabled: true,
	theme: "dark",
	exportEnabled: true,
	title: {
		text: "Estados de tiquetes"
	},
	subtitles: [{
		text: "Se muestran los estados actuales de los tiquetes de todo el sistema"
	}],data: [{}]
	
	}




  constructor(private estadisticasService:ServiceEstadisticasService, private usuarioservicio: ServiceUsuarioService ) { 
  }
  estadosRutas:ContadoresView[];
  datosGrafica1:ContadoresView;
  ngOnInit(): void {

	this.usuarioservicio.getUsuarios().
		subscribe(data=>{
			this.usu=data;
			console.log(data)
		  });

	this.usu.forEach(element => {

		if(element.rol == 0){

			this.cant_clientes = this.cant_clientes+1


		}else if(element.rol == 1){

			this.cant_admin = this.cant_admin+1


		}else if (element.rol ==2){
			this.cant_cond = this.cant_cond +1
		}


		
	});

	console.log()




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

			  this.chartOptions2.data=[{
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