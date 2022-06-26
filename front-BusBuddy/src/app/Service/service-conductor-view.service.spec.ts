import { TestBed } from '@angular/core/testing';

import { ServiceConductorViewService } from './service-conductor-view.service';

describe('ServiceConductorViewService', () => {
  let service: ServiceConductorViewService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ServiceConductorViewService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
