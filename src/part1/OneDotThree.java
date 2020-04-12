package part1;

/**
 * @author natalya_ezhkova@mail.ru
 */
public class OneDotThree {
    import React from 'react'
            import ReactDOM from 'react-dom'
            const Header = (props) => {
        console.log(props)
        return ( <
                div >
        <
        p >
                Your course name is { props.course } < /p> < /
        div >
    )
    }
const Part = () => { return ( < div > < p > Part... < /p>    </div > ) }
const Content = () => {
        return ( <
                div >
        <
        Part / >
        <
        Part / >
        <
        Part / >
        <
        /
        div >
    )
    }

const Total = (props) => {
        return ( <
                div >
        <
        p >
                The amount of exercises in part 1 are { props.exercises1 }, in part2 { props.exercises2 }
        and { props.exercises3 } in part3 < /p> < /
        div >
    )
    }

const App = () => {
        // const-definitions
    const course = 'Half Stack application development'
    const part1 = {
                name: 'Fundamentals of React',
                exercises: 10
    }

    const part2 = {
                name: 'Using props to pass data',
                exercises: 7
    }



    const part3 = {
                name: 'State of a component',
                exercises: 14
    }

        return ( <
                div >
        <
        h1 > Greetings < /h1> <
        Header course = { course }
                / > <
        Content /
                >
        <
        Total part1 exercises = { part1.exercises }
        part2 exercises = { part2.exercises }
        part3 exercises = { part3.exercises }
                / > < /
        div >
    )
    }


ReactDOM.render( < App / > , document.getElementById('root'))
}
