import { TestBed } from '@angular/core/testing';

import { ServiceConductorService } from './service-conductor.service';

describe('ServiceConductorService', () => {
  let service: ServiceConductorService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ServiceConductorService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
