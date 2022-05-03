package com.hemebiotech.analytics.counter;

import java.util.List;
import java.util.Map;

public interface ISymptomsTreeMap {

    Map<String, Integer> countFrequencies(List<String> list);

}
