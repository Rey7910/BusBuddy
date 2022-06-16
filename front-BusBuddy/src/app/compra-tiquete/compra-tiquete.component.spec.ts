import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CompraTiqueteComponent } from './compra-tiquete.component';

describe('CompraTiqueteComponent', () => {
  let component: CompraTiqueteComponent;
  let fixture: ComponentFixture<CompraTiqueteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CompraTiqueteComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CompraTiqueteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
