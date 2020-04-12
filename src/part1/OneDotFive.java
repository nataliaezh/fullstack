package part1;

/**
 * @author natalya_ezhkova@mail.ru
 */
public class OneDotFive {
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

const Content = (props) => {
        return ( <
                div >

        <
        p >
                Content(props) < /p> < /
        div >
    )
    }

const Total = (props) => {
        return ( <
                div >
        <
        p >
                Total: (props) < /p> < /
        div >
    )
    }

const App = () => {
        // const-definitions
    const course = {
                name: 'Half Stack application development',
                parts: [{
            name: 'Fundamentals of React',
                    exercises: 10
        },
        {
            name: 'Using props to pass data',
                    exercises: 7
        },
        {
            name: 'State of a component',
                    exercises: 14
        }
        ]
    }

        return ( < div >

                Header course = (course.name) Content parts = { course.parts.name }

        Total parts = { course.parts.exercises } <
        /
        div >
    )
    }


ReactDOM.render( < App / > , document.getElementById('root'))
}
