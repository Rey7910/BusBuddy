import { TestBed } from '@angular/core/testing';

import { ServiceBusService } from './service-bus.service';

describe('ServiceBusService', () => {
  let service: ServiceBusService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ServiceBusService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
