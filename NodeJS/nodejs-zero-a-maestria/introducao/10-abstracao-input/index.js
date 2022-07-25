import inquirer from 'inquirer';


inquirer.prompt([{
    name: 'p1',
    message: 'Qual a sua nota?'
}, {
    name: 'p2',
    message: 'Qual a sua nota?'
}]).then((answers) => {
    console.log(answers)
}).catch(err => console.log(err))

