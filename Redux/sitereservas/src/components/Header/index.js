import { Link } from 'react-router-dom';
import logo from '../../assets/logo/logo.svg';
import './style.css';
import { useSelector } from 'react-redux/es/exports';



export default function Header(){
    const reserveSize = useSelector(state => state.reserve.length)

    return(
        <header className='container'>
            <Link to="/">
            <img className='logo' src={logo} alt="logo projeto"/>
            </Link>

            <Link className="reserva" to="/reservas">
                <div>
                    <strong>Minhas reservas</strong>

                    <span>{reserveSize} reservas</span>
                </div>
            </Link>
        </header>
    )
}