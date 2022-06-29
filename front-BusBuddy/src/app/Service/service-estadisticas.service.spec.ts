import { TestBed } from '@angular/core/testing';

import { ServiceEstadisticasService } from './service-estadisticas.service';

describe('ServiceEstadisticasService', () => {
  let service: ServiceEstadisticasService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ServiceEstadisticasService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
