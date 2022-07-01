import Rotas from './rotas';
import { BrowserRouter } from 'react-router-dom';

import Header from './components/Header';

function App() {
  return (
    <BrowserRouter>
      <Header/>
      <Rotas/>
    </BrowserRouter>
  );
}

export default App;
