package io.eberlein.debt.events;

import io.eberlein.debt.objects.Person;

public class PersonAddedEvent {
    private Person person;

    public PersonAddedEvent(Person p){
        person = p;
    }

    public Person getPerson() {
        return person;
    }
}
