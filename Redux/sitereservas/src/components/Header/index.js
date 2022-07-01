import { Link } from 'react-router-dom';
import logo from '../../assets/logo/logo.svg';
import './style.css';


export default function Header(){
    return(
        <header className='container'>
            <Link to="/">
            <img className='logo' src={logo} alt="logo projeto"/>
            </Link>

            <Link to="/reservas">
                <div>
                    <strong>Minhas reservas</strong>
                    <span>0 reservas</span>
                </div>
            </Link>
        </header>
    )
}