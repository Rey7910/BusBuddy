import { TestBed } from '@angular/core/testing';

import { ServiceReservasService } from './service-reservas.service';

describe('ServiceReservasService', () => {
  let service: ServiceReservasService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ServiceReservasService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
