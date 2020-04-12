package part1;

/**
 * @author natalya_ezhkova@mail.ru
 */
public class OneDotFour {
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

const Content = () => {
        return ( <
                div >

        <
        p >
                Content < /p> < /
        div >
    )
    }

const Total = () => {
        return ( <
                div >
        <
        p >
                Total: < /p> < /
        div >
    )
    }

const App = () => {
        // const-definitions
    const course = 'Half Stack application development'


    const parts = [{
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

        return ( <
                div >
        <
        Header course = { course }
                /> <
        Content parts = { parts }
                /> <
        Total parts = { parts }
                /> < /
        div >
    )
    }


ReactDOM.render( < App / > , document.getElementById('root'))
}
