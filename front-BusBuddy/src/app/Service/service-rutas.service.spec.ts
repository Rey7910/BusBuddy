import { TestBed } from '@angular/core/testing';

import { ServiceRutasService } from './service-rutas.service';

describe('ServiceRutasService', () => {
  let service: ServiceRutasService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ServiceRutasService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
