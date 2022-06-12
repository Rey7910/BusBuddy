import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AsignarRutasEmpresaComponent } from './asignar-rutas-empresa.component';

describe('AsignarRutasEmpresaComponent', () => {
  let component: AsignarRutasEmpresaComponent;
  let fixture: ComponentFixture<AsignarRutasEmpresaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AsignarRutasEmpresaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AsignarRutasEmpresaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
