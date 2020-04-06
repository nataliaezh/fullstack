package part1;

/**
 * @author natalya_ezhkova@mail.ru
 */
public class OneDotOne {
    import React from 'react'
            import ReactDOM from 'react-dom'
            const Header = (props) => {
        return ( <
                div >
        <
        p >
                Your course name is { props.course } < /p> < /
        div >
    )
    }

const Content = (props) => {
        return ( <
                div >
        <
        p >
                The parts of the course are { props.part1 }, { props.part3 }
        and { props.part2 } < /p> < /
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
    const part1 = 'Fundamentals of React'
    const exercises1 = 10
    const part2 = 'Using props to pass data'
    const exercises2 = 7
    const part3 = 'State of a component'
    const exercises3 = 14
        return ( <
                div >
        <
        h1 > Greetings < /h1> <
        Header course = { course }
                / > <
        Content part1 = { part1 }
        part2 = { part2 }
        part3 = { part3 }
                / > <
        Total exercises1 = { exercises1 }
        exercises2 = { exercises2 }
        exercises3 = { exercises3 }
                / > < /
        div >
    )
    }


ReactDOM.render( < App / > , document.getElementById('root'))

}
