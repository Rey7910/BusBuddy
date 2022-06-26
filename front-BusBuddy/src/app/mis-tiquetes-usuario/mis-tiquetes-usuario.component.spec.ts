import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MisTiquetesUsuarioComponent } from './mis-tiquetes-usuario.component';

describe('MisTiquetesUsuarioComponent', () => {
  let component: MisTiquetesUsuarioComponent;
  let fixture: ComponentFixture<MisTiquetesUsuarioComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MisTiquetesUsuarioComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MisTiquetesUsuarioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
