class CandidateElimination:
    def __init__(self, attributes):
        self.attributes = attributes
        self.specific_hypothesis = ['?' * len(attributes)]
        self.general_hypotheses = [self.specific_hypothesis.copy()]

    def is_more_general(self, general, specific):
        """Check if general is a more general hypothesis than specific."""
        return all(g == '?' or g == s for g, s in zip(general, specific))

    def is_consistent(self, hypothesis, example):
        """Check if a hypothesis is consistent with a given example."""
        return all(h == '?' or h == e for h, e in zip(hypothesis, example))

    def update(self, positive_examples, negative_examples):
        """Update the version space with new examples."""
        for example in positive_examples:
            self._update_for_positive_example(example)
        
        for example in negative_examples:
            self._update_for_negative_example(example)

    def _update_for_positive_example(self, example):
        """Update hypotheses for a positive example."""
        new_specific = []
        for h in self.specific_hypothesis:
            if self.is_consistent(h, example):
                new_specific.append(self._generalize(h, example))
        self.specific_hypothesis = new_specific

        new_general = []
        for h in self.general_hypotheses:
            if not self.is_consistent(h, example):
                new_general.extend(self._specialize(h, example))
        self.general_hypotheses = [g for g in new_general if self.is_more_general(g, h) for h in self.specific_hypothesis]

    def _update_for_negative_example(self, example):
        """Update hypotheses for a negative example."""
        self.specific_hypothesis = [h for h in self.specific_hypothesis if not self.is_consistent(h, example)]
        new_general = []
        for h in self.general_hypotheses:
            if self.is_consistent(h, example):
                new_general.extend(self._specialize(h, example))
        self.general_hypotheses = [g for g in new_general if any(self.is_more_general(g, h) for h in self.specific_hypothesis)]

    def _generalize(self, hypothesis, example):
        """Generalize a specific hypothesis."""
        return [e if e == h else '?' for h, e in zip(hypothesis, example)]

    def _specialize(self, hypothesis, example):
        """Specialize a general hypothesis."""
        new_hypotheses = []
        for i, (h, e) in enumerate(zip(hypothesis, example)):
            if h == '?':
                new_hypotheses.extend(self._generate_specializations(hypothesis, i, e))
        return new_hypotheses

    def _generate_specializations(self, hypothesis, index, value):
        """Generate specializations by setting a specific attribute value."""
        specializations = []
        for v in self.attributes[index]:
            if v != value:
                new_hypothesis = hypothesis.copy()
                new_hypothesis[index] = v
                specializations.append(new_hypothesis)
        return specializations

    def get_version_space(self):
        return self.specific_hypothesis, self.general_hypotheses


# Example usage:
attributes = [['Sunny', 'Rainy'], ['Warm', 'Cold'], ['Normal', 'High'], ['Strong', 'Weak']]
positive_examples = [['Sunny', 'Warm', 'Normal', 'Strong'], ['Sunny', 'Warm', 'High', 'Strong']]
negative_examples = [['Rainy', 'Cold', 'Normal', 'Weak'], ['Rainy', 'Warm', 'Normal', 'Weak']]

ce = CandidateElimination(attributes)
ce.update(positive_examples, negative_examples)

specific, general = ce.get_version_space()
print("Specific Hypotheses:", specific)
print("General Hypotheses:", general)
