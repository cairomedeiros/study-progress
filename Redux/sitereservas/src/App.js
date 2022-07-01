import Rotas from './rotas';
import { BrowserRouter } from 'react-router-dom';

import { Provider } from 'react-redux';
import store from './store/';

import Header from './components/Header';

function App() {
  return (
    <Provider store={store}>
    <BrowserRouter>
      <Header/>
      <Rotas/>
    </BrowserRouter>
    </Provider>
  );
}

export default App;
