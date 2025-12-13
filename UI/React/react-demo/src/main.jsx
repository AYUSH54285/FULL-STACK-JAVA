import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.jsx'
import { Login } from './components/login/login.jsx'
import '../node_modules/bootstrap/dist/css/bootstrap.css';
import '../node_modules/bootstrap-icons/font/bootstrap-icons.css';
import "../node_modules/bootstrap/dist/js/bootstrap.bundle.js";
import { DataBinding } from './components/data-binding/data-binding.jsx'
import { FakeStore } from './components/fakestore/fakestore.jsx'
import { Nasa } from './components/nasa/nasa.jsx'
import { StyleDemo } from './components/style-demo/style-demo.jsx'
import {EventDemo} from './components/event-demo/event-demo.jsx'
// import { MouseOver } from './components/mouse-demo/mouse-demo.jsx'
// import { MouseDown } from './components/mouse-demo/mouse-demo.jsx'
// import { MouseMove } from './components/mouse-demo/mouse-demo.jsx'
import { KeyDemo } from './components/key-demo/key-demo.jsx'
import { EMICalculator } from './components/state-event-demo/state-event-demo.jsx'
import { ButtonDemo } from './components/button-demo/button-demo.jsx'
import { DebounceDemo } from './components/debounce-demo/debounce-demo.jsx'
import { ThrottleDemo } from './components/throttle-demo/throttle-demo.jsx'
import { CarouselDemo } from './components/carousel-demo/carousel-demo.jsx'
import { FormDemo } from './components/form-demo/form-demo.jsx'
import { FormikDemo } from './components/formik-demo/formik-demo.jsx'
import { ControlledDemo } from './controlled-components/controlled-demo.jsx'
import { Weather } from './controlled-components/weather.jsx'
import { ConditionDemo } from './components/condition-demo/condition-demo.jsx'
import { DataDemo } from './components/data-demo/Data-demo.jsx'
import { UserDashboard } from './components/user-dashboard/user-dashboard.jsx'
import { Home } from './components/home/home.jsx'
import { FakeStoreIndex } from './components/fakestore-routing/fakestore-index.jsx'


createRoot(document.getElementById('root')).render(
  <StrictMode>
    <FakeStore />
  </StrictMode>
)
