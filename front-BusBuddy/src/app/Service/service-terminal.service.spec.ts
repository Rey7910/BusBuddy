import { TestBed } from '@angular/core/testing';

import { ServiceTerminalService } from './service-terminal.service';

describe('ServiceTerminalService', () => {
  let service: ServiceTerminalService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ServiceTerminalService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
