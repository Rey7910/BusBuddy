import { TestBed } from '@angular/core/testing';

import { ServicePersonalService } from './service-personal.service';

describe('ServicePersonalService', () => {
  let service: ServicePersonalService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ServicePersonalService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
