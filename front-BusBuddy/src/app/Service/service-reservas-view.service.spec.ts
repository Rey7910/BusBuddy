import { TestBed } from '@angular/core/testing';

import { ServiceReservasViewService } from './service-reservas-view.service';

describe('ServiceReservasViewService', () => {
  let service: ServiceReservasViewService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ServiceReservasViewService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
