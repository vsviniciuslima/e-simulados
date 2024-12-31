package br.usp.esimulados.resource.generated;

import br.usp.esimulados.model.questions.Question;
import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import io.quarkus.rest.data.panache.MethodProperties;
import io.quarkus.rest.data.panache.ResourceProperties;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Tag(name = "Questions")
@ResourceProperties
public interface Questions extends PanacheEntityResource<Question, Long>  {

    @MethodProperties(exposed = false)
    Question add(Question entity);
}
