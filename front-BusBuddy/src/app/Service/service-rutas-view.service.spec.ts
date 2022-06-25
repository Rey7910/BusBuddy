import { TestBed } from '@angular/core/testing';

import { ServiceRutasViewService } from './service-rutas-view.service';

describe('ServiceRutasViewService', () => {
  let service: ServiceRutasViewService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ServiceRutasViewService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
